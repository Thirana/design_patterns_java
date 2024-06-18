package structural.Decorator;

// Abstract base decorator (3)
public abstract class DataSourceDecorator implements DataSource {

    // The wrapped DataSource object
    // This object get additional behaviors from concrete decorator classes
    private DataSource wrappee;

    // Constructor to initialize the wrapped DataSource object
    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    // method to call wrapee writeData() method
    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    // method to call wrapee readData() method
    @Override
    public String readData() {
        return wrappee.readData();
    }

}
