package Creational.Factory;

// HTMLDialog will provide HTML Button (5)
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton(){
        return new HtmlButton();
    }

}
