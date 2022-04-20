package pl.simo333.designpatterns.abstractfactory.refactoringguruexample.app;

import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.factories.GUIFactory;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.factories.MacOSFactory;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
