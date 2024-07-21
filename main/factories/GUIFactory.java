package factories;

import interfaces.Checkbox;
import interfaces.Dropdown;
import interfaces.Button;


/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    Dropdown createDropdown();
}
