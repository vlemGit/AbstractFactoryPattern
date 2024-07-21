package checkboxes;
import java.util.logging.Logger;

import interfaces.Checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */

public class WindowsCheckbox implements Checkbox{
    
public static final Logger LOGGER = Logger.getLogger(WindowsCheckbox.class.getName());

    @Override
    public void paint(){
        LOGGER.info("You have created a " + WindowsCheckbox.class.getName());
    }
}
