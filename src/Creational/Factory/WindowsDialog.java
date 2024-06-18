package Creational.Factory;

// Windows dialog will provide Windows button (6)
public class WindowsDialog extends Dialog{

     @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
