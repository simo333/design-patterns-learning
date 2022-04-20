package pl.simo333.designpatterns.abstractfactory.refactoringguruexample.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
