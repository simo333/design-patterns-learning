package pl.simo333.designpatterns.factorymetod.refactoringguruexample.factory;

import pl.simo333.designpatterns.factorymetod.refactoringguruexample.buttons.Button;
import pl.simo333.designpatterns.factorymetod.refactoringguruexample.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
