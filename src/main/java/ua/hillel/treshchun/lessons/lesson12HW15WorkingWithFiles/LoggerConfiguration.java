package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles;

public interface LoggerConfiguration {
    public void createNewFileUponLimitReached();

    public LoggingLevel getLevel();

    public String getFilePath();

    public String getFileFormat();

    public int getSizeLimitBytes();
}
