package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger;

public abstract class Logger {

    private LoggerConfiguration configuration;

    public LoggerConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(LoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    public abstract void debug(String message);

    public abstract void info(String message);
}
