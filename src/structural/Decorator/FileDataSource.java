package structural.Decorator;

import java.io.*;

// Simple data reader-writer (2)
public class FileDataSource implements DataSource {

    // holds file path
    private String name;

    // constructor
    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data){
        File file = new File(name);

        try(OutputStream fos = new FileOutputStream(file)){

            // convert string data to byte stream. 
            // other parameters are used to identify start and end points of stream
            fos.write(data.getBytes(), 0, data.length());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

     @Override
    public String readData() {

        // initialize character array. use to store characters read from file
        char[] buffer = null;


        File file = new File(name);

        // creates a new file reader from file object
        try (FileReader reader = new FileReader(file)) {
            // reading the data from file and store it in buffer
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        // convert the character array to a string and then return
        return new String(buffer);
    }

}
