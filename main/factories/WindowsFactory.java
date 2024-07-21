package factories;

import buttons.WindowsButton;
import checkboxes.WindowsCheckbox;
import dropdowns.WindowsDropdown;
import interfaces.Checkbox;
import interfaces.Dropdown;
import interfaces.Button;


/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
    
}
