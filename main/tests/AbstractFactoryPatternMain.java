package tests;

import factories.GUIFactory;
import factories.MacOsFactory;
import factories.WindowsFactory;

public class AbstractFactoryPatternMain {


    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */

    private static ApplicationFactory configureApplication(){
    ApplicationFactory app;
    GUIFactory factory;

    String osName = System.getProperty("os.name").toLowerCase();

    if(osName.contains("mac")){
        factory = new MacOsFactory();
    } else {
        factory = new WindowsFactory();
    }
    app = new ApplicationFactory(factory);
    return app;

    }
   


    public static void main(String[] args){
        ApplicationFactory app = configureApplication();
        app.paint();
    }
}