package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles;

import java.io.*;
import java.time.LocalDateTime;

public class FileLogger implements Logger {
    private FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    public void debug(String message) {
        if (configuration.getLevel() == LoggingLevel.DEBUG) {
            StringBuilder logEntry = new StringBuilder();
            logEntry.append(LocalDateTime.now())
                    .append(" [DEBUG] Message: ")
                    .append(message)
                    .append("\n");
            try {
                writeMessage(logEntry);
            } catch (FileMaxSizeReachedException e) {
                configuration.createNewFileUponLimitReached();
                System.out.print(e.getMessage() + configuration.getFilePath());
            }
        }
    }

    public void info(String message) {
        if (configuration.getLevel() == LoggingLevel.DEBUG || configuration.getLevel() == LoggingLevel.INFO) {
            StringBuilder logEntry = new StringBuilder();
            logEntry.append(LocalDateTime.now())
                    .append(" [INFO] Message: ")
                    .append(message)
                    .append("\n");
            try {
                writeMessage(logEntry);
            } catch (FileMaxSizeReachedException e) {
                configuration.createNewFileUponLimitReached();
                System.out.print(e.getMessage() + configuration.getFilePath());
            }
        }
    }

    private void writeMessage(StringBuilder logEntry) throws FileMaxSizeReachedException {
        try {
            File logFile = new File(configuration.getFilePath());
            if ((logFile.length() + logEntry.toString().getBytes().length) >= configuration.getSizeLimitBytes()) {
                throw new FileMaxSizeReachedException("Max file size limit (" + configuration.getSizeLimitBytes()
                        + ") reached at " + (logFile.length() + logEntry.toString().getBytes().length)
                        + " bytes, moving to a new file at ");
            }
            logFile = new File(configuration.getFilePath());
            OutputStream outputStream = new FileOutputStream(logFile, true);
            outputStream.write(logEntry.toString().getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (IOException e) {
            System.out.println("File write issue" + e.getMessage());
        }
    }
}
