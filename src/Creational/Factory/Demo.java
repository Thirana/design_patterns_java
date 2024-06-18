package Creational.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// clients code -> everything comes together here
public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static Dialog dialog;


    public static void main(String[] args) throws IOException {
        
        System.out.println(
            "Select your Platform: " + "\n" +
            "1 - Web" + "\n" +
            "2 - Windows" + "\n"
        );
        int choice = Integer.parseInt(reader.readLine());

        /**
            * The concrete factory is usually chosen depending on configuration or
            *environment options.
        */
        if (choice == 1){
            dialog = new HtmlDialog();
        }
        else if (choice == 2){
            dialog = new WindowsDialog();
        }

        runBusinessLogic();

    }

    /**
        * All of the client code should work with factories and products through
        * abstract interfaces. This way it does not care which factory it works
        * with and what kind of product it returns.
     */
     static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
