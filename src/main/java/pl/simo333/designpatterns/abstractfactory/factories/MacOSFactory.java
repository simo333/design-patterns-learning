package pl.simo333.designpatterns.abstractfactory.factories;

import pl.simo333.designpatterns.abstractfactory.buttons.Button;
import pl.simo333.designpatterns.abstractfactory.buttons.MacOSButton;
import pl.simo333.designpatterns.abstractfactory.checkboxes.Checkbox;
import pl.simo333.designpatterns.abstractfactory.checkboxes.MacOSCheckbox;

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
