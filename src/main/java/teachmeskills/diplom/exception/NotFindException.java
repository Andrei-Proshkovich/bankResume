package teachmeskills.diplom.exception;

import java.io.IOException;

public class NotFindException extends IOException {
    public NotFindException() {
        System.out.println("Not find this id");
    }
}
