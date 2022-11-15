import java.io.IOException;

public class TestException {
    public static void main(String[] args) {
        String test = "yes";
        try {
            System.out.println("Starting the try block");
            doRisky(test);
            System.out.println("Finishing the try block");
        } catch ( Exception ex) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("Main End");
    }

    static void doRisky(String test) {
        System.out.println("Starting doRisky method");
        if("yes".equals(test)){
            throw new Exception();
        }
        System.out.println("Ending doRisky");
        return;
    }
}
