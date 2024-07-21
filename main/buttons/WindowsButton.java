package buttons;
import java.util.logging.Logger;

import interfaces.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */

public class WindowsButton implements Button{

    public static final Logger LOGGER = Logger.getLogger(WindowsButton.class.getName()); 

    @Override
    public void paint() {
        LOGGER.info("You have created a " + WindowsButton.class.getName());
    }
    
}
