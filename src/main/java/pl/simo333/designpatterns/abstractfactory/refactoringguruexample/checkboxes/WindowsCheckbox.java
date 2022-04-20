package pl.simo333.designpatterns.abstractfactory.refactoringguruexample.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
