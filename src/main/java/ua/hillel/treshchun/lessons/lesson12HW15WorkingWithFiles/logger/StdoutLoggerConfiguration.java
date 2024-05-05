package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger;

public class StdoutLoggerConfiguration extends LoggerConfiguration {
    public StdoutLoggerConfiguration(LoggingLevel level, String outputFormat) {
        super.setLevel(level);
        super.setOutputFormat(outputFormat);
    }

    @Override
    public String toString() {
        return "StdoutLoggerConfiguration{" +
                "\n     level=" + super.getLevel() +
                "\n     fileFormat='" + super.getFormat() + '\'' +
                '}';
    }
}
