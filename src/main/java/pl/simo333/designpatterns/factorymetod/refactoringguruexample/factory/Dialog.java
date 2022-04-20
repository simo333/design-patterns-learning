package pl.simo333.designpatterns.factorymetod.refactoringguruexample.factory;

import pl.simo333.designpatterns.factorymetod.refactoringguruexample.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
