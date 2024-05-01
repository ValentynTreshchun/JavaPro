package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger;

public abstract class LoggerConfiguration {
    private LoggingLevel level;
    private String outputFormat;

    public LoggingLevel getLevel() {
        return level;
    }

    public String getFormat() {
        return outputFormat;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }
}
