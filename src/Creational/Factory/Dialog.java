package Creational.Factory;

// Base Creator -> Factory (4)

/*
 * Note that "Factory" is just a role for the class.
 * It should have some core business logic which needs different product to be created.
 */
public abstract class Dialog {

    // abstract method.
    // Subclasses will override this method in order to create specific button object
    public abstract Button createButton();


    public void renderWindow(){

        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

}
