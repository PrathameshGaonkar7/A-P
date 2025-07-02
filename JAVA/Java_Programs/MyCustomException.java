class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class MyCustomException {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom error occurred");
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}