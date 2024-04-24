package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.interfaces;

import ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger.LoggingLevel;

public interface LoggerConfiguration {
    public void createNewFileUponLimitReached();

    public LoggingLevel getLevel();

    public String getFilePath();

    public String getFileFormat();

    public int getSizeLimitBytes();
}
