package exception_test;

public class UserDeniedException extends Exception {
    public UserDeniedException(String message) {
        super(message);
    }
}