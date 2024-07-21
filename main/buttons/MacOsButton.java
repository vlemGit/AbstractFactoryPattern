package buttons;
import java.util.logging.Logger;

import interfaces.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */

public class MacOsButton implements Button{

    public static final Logger LOGGER = Logger.getLogger(MacOsButton.class.getName()); 

    @Override
    public void paint() {
        LOGGER.info("You have created a " + MacOsButton.class.getName());
    }
    
}
