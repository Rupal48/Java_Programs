class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
    public void doSomething() throws CustomException {
        try {
            int x = 1 / 0;
        }
        catch (ArithmeticException e) {
            throw new CustomException("ArithmeticException occurred", e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new CustomException("ArrayIndexOutOfBoundsException occurred", e);
        }
        catch (NullPointerException e) {
            throw new CustomException("NullPointerException occurred", e);
        }
        catch (Exception e) {
            throw new CustomException("Unknown exception occurred", e);
        }
        finally {
            throw new CustomException("Finally block exception occurred");
        }
    }
}
public class College {
    public static void main(String[] args) {
        System.out.println("This program was made by Rupal Malhotra.");
        try {
            new CustomException("Custom exception occurred").doSomething();
        }
        catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
