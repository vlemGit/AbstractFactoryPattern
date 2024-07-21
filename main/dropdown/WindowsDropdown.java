package dropdown;

import interfaces.Dropdown;
import java.util.logging.Logger;

public class WindowsDropdown implements Dropdown{

public static final Logger LOGGER = Logger.getLogger(WindowsDropdown.class.getName());

    @Override
    public void paint() {
        LOGGER.info("You have created a " + WindowsDropdown.class.getName());
    }

}
