package pl.simo333.designpatterns.abstractfactory.refactoringguruexample.checkboxes;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
