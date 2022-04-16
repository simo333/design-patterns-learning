package pl.simo333.factorymetod.refactoringguruexample.factory;

import pl.simo333.factorymetod.refactoringguruexample.buttons.Button;
import pl.simo333.factorymetod.refactoringguruexample.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
