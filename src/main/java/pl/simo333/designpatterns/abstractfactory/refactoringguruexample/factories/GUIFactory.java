package pl.simo333.designpatterns.abstractfactory.refactoringguruexample.factories;

import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.buttons.Button;
import pl.simo333.designpatterns.abstractfactory.refactoringguruexample.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
