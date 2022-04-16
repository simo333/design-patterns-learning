package pl.simo333.factorymetod.refactoringguruexample;

import pl.simo333.factorymetod.refactoringguruexample.factory.Dialog;
import pl.simo333.factorymetod.refactoringguruexample.factory.HtmlDialog;
import pl.simo333.factorymetod.refactoringguruexample.factory.WindowsDialog;

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
