package ua.hillel.treshchun.lessons.lesson10Homework11;

public class ArraySizeException extends Exception {
    public ArraySizeException() {
    }

    public ArraySizeException(String message) {
        super(message);
    }

    public ArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArraySizeException(Throwable cause) {
        super(cause);
    }

    public ArraySizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
