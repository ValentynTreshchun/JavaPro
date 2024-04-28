package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger;

import ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.exceptions.FileMaxSizeReachedException;

import java.io.*;
import java.time.LocalDateTime;

public class FileLogger extends Logger {
    public FileLogger(FileLoggerConfiguration configuration) {
        super.setConfiguration(configuration);
    }

    public void debug(String message) {
            if (super.getConfiguration().getLevel() == LoggingLevel.DEBUG) {
                StringBuilder logEntry = new StringBuilder();
                logEntry.append(String.format(super.getConfiguration().getFormat(), LocalDateTime.now(),
                        super.getConfiguration().getLevel().toString(), message));
                try {
                    writeMessage(logEntry.toString());
                } catch (FileMaxSizeReachedException e) {
                    ((FileLoggerConfiguration)super.getConfiguration()).createNewFileUponLimitReached();
                    System.out.print(e.getMessage() + ((FileLoggerConfiguration)super.getConfiguration()).getFilePath());
                }
            }
    }

    public void info(String message) {
        if (super.getConfiguration().getLevel() == LoggingLevel.DEBUG
                || super.getConfiguration().getLevel() == LoggingLevel.INFO) {
            StringBuilder logEntry = new StringBuilder();
            logEntry.append(String.format(super.getConfiguration().getFormat(), LocalDateTime.now(),
                    super.getConfiguration().getLevel().toString(), message));
            try {
                writeMessage(logEntry.toString());
            } catch (FileMaxSizeReachedException e) {
                ((FileLoggerConfiguration)super.getConfiguration()).createNewFileUponLimitReached();
                System.out.print(e.getMessage() + ((FileLoggerConfiguration)super.getConfiguration()).getFilePath());
            }
        }
    }

    private void writeMessage(String logEntry) throws FileMaxSizeReachedException {
        try {
            File logFile = new File(((FileLoggerConfiguration)super.getConfiguration()).getFilePath());
            if ((logFile.length() + logEntry.getBytes().length)
                    >= ((FileLoggerConfiguration)super.getConfiguration()).getSizeLimitBytes()) {
                throw new FileMaxSizeReachedException("Max file size limit ("
                        + ((FileLoggerConfiguration)super.getConfiguration()).getSizeLimitBytes()
                        + ") reached at " + (logFile.length() + logEntry.getBytes().length)
                        + " bytes, moving to a new file at ");
            }
            logFile = new File(((FileLoggerConfiguration)super.getConfiguration()).getFilePath());
            OutputStream outputStream = new FileOutputStream(logFile, true);
            outputStream.write(logEntry.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (IOException e) {
            System.out.println("File write issue" + e.getMessage());
        }
    }
}
