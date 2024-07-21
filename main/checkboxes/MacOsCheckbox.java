package checkboxes;
import java.util.logging.Logger;

import interfaces.Checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */

public class MacOsCheckbox implements Checkbox{
    
public static final Logger LOGGER = Logger.getLogger(MacOsCheckbox.class.getName());

    @Override
    public void paint(){
        LOGGER.info("You have created a " + MacOsCheckbox.class.getName());
    }
}
