package pl.simo333.designpatterns.abstractfactory.factories;

import pl.simo333.designpatterns.abstractfactory.buttons.Button;
import pl.simo333.designpatterns.abstractfactory.buttons.WindowsButton;
import pl.simo333.designpatterns.abstractfactory.checkboxes.Checkbox;
import pl.simo333.designpatterns.abstractfactory.checkboxes.WindowsCheckbox;

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
