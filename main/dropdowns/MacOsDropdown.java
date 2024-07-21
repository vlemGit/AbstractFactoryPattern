package dropdowns;

import interfaces.Dropdown;
import java.util.logging.Logger;

public class MacOsDropdown implements Dropdown{

public static final Logger LOGGER = Logger.getLogger(MacOsDropdown.class.getName());

    @Override
    public void paint() {
        LOGGER.info("You have created a " + MacOsDropdown.class.getName());
    }

}
