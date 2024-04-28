package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger;

import java.time.LocalDateTime;

public class StdoutLogger extends Logger {
    public StdoutLogger(StdoutLoggerConfiguration configuration) {
        super.setConfiguration(configuration);
    }

    @Override
    public void debug(String message) {
        if (super.getConfiguration().getLevel() == LoggingLevel.DEBUG) {
            StringBuilder logEntry = new StringBuilder();
            logEntry.append(String.format(super.getConfiguration().getFormat(), LocalDateTime.now(),
                    super.getConfiguration().getLevel().toString(), message));
            System.out.println(logEntry);
        }
    }

    @Override
    public void info(String message) {
        if (super.getConfiguration().getLevel() == LoggingLevel.DEBUG
                || super.getConfiguration().getLevel() == LoggingLevel.INFO) {
            StringBuilder logEntry = new StringBuilder();
            logEntry.append(String.format(super.getConfiguration().getFormat(), LocalDateTime.now(),
                    super.getConfiguration().getLevel().toString(), message));
            System.out.println(logEntry);
        }
    }
}
