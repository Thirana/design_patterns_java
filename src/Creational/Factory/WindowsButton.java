package Creational.Factory;

// concrete product -> Windows Button implementation (3)
// we can add corresponding implementations for methods (this is just for testing purpose)
public class WindowsButton implements Button {

    public void render(){
        System.out.println("Test Windows Button");
        onClick();
    }

    public void onClick(){
        System.out.println("Click button says - 'Hello wordl Windows'");
    }

}
