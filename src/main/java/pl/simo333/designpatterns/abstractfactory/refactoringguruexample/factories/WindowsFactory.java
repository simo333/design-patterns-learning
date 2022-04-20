package pl.simo333.designpatterns.abstractfactory.refactoringguruexample.factories;

import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.buttons.Button;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.buttons.WindowsButton;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.checkboxes.Checkbox;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
