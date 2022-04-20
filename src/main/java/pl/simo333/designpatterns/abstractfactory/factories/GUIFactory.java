package pl.simo333.designpatterns.abstractfactory.factories;

import pl.simo333.designpatterns.abstractfactory.buttons.Button;
import pl.simo333.designpatterns.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
