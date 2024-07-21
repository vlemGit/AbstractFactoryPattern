package tests;

import factories.GUIFactory;
import interfaces.Button;
import interfaces.Checkbox;
import interfaces.Dropdown;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */


public class ApplicationFactory {

    private Button button;
    private Checkbox checkbox;
    private Dropdown dropdown;

    public ApplicationFactory(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        dropdown = factory.createDropdown();

    }

    public void paint(){
        button.paint();
        checkbox.paint();
        dropdown.paint();
    }

}