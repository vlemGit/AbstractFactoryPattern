package factories;

import buttons.MacOsButton;
import checkboxes.MacOsCheckbox;
import dropdowns.MacOsDropdown;
import interfaces.Checkbox;
import interfaces.Dropdown;
import interfaces.Button;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

public class MacOsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }

    @Override
    public Dropdown createDropdown(){
        return new MacOsDropdown();
    }
    
}
