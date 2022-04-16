package pl.simo333.factorymetod.refactoringguruexample.factory;

import pl.simo333.factorymetod.refactoringguruexample.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
