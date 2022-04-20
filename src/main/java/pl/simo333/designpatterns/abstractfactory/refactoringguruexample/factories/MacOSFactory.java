package pl.simo333.designpatterns.abstractfactory.refactoringguruexample.factories;

import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.buttons.Button;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.buttons.MacOSButton;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.checkboxes.Checkbox;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}
