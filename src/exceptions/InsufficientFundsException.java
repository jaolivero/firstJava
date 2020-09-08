package exceptions;

// checked
//Unchecked(runtime) -> RuntimeException
public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("Insuffient Funds");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
