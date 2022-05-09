package exception;

import java.io.IOException;

public class NotFindException extends IOException {
    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }
}
