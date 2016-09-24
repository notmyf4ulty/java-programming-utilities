package src.main.template.lib.junit;

// NOTE: Import class to be tested.
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(YOUR_CLASS_TO_BE_TESTED.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Tests finished with " + (result.wasSuccessful() ? "success" : "failure") + ".");
    }
} 
