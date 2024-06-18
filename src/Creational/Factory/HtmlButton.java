package Creational.Factory;

// concrete product -> HTML Button implementation
// we can add corresponding implementations for methods (this is just for testing purpose)
public class HtmlButton implements Button {

    public void render(){
        System.out.println("Test HTML Button");
        onClick();
    }

    public void onClick(){
        System.out.println("Click button says - 'Hello wordl HTML'");
    }

}
