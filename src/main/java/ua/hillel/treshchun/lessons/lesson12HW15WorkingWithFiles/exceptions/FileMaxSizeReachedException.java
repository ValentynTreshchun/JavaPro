package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.exceptions;

public class FileMaxSizeReachedException extends Exception {
    public FileMaxSizeReachedException() {
    }

    public FileMaxSizeReachedException(String message) {
        super(message);
    }

    public FileMaxSizeReachedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileMaxSizeReachedException(Throwable cause) {
        super(cause);
    }

    public FileMaxSizeReachedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
