package pl.simo333.designpatterns.abstractfactory.refactoringguruexample.app;

import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.buttons.Button;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.checkboxes.Checkbox;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.factories.GUIFactory;

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
