package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.exceptions;

public class FileConfigurationException extends Exception {
    public FileConfigurationException() {
    }

    public FileConfigurationException(String message) {
        super(message);
    }

    public FileConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileConfigurationException(Throwable cause) {
        super(cause);
    }

    public FileConfigurationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
