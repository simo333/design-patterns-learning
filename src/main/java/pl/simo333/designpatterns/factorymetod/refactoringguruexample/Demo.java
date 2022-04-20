package pl.simo333.designpatterns.factorymetod.refactoringguruexample;

import pl.simo333.designpatterns.factorymetod.refactoringguruexample.factory.WindowsDialog;
import pl.simo333.designpatterns.factorymetod.refactoringguruexample.factory.Dialog;
import pl.simo333.designpatterns.factorymetod.refactoringguruexample.factory.HtmlDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if(System.getProperty("os.name").equals("Windows  10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
