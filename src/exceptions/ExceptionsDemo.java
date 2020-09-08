package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException{
            var account = new Account();
        try {
            account.deposit(1);
        } catch (AccountException e) {
            var cause = e.getCause();
            e.printStackTrace(cause.getMessage();
        }
    }
}
