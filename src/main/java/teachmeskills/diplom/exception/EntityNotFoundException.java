package teachmeskills.diplom.exception;

import java.io.IOException;

public class EntityNotFoundException extends IOException {
    public EntityNotFoundException() {
        System.out.println("Not found this id");
    }
}
