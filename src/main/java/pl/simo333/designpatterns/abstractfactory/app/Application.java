package pl.simo333.designpatterns.abstractfactory.app;

import pl.simo333.designpatterns.abstractfactory.buttons.Button;
import pl.simo333.designpatterns.abstractfactory.checkboxes.Checkbox;
import pl.simo333.designpatterns.abstractfactory.factories.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
