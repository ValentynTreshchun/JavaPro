package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles;

import java.io.IOException;

public interface LoggerConfigurationLoader {
    public FileLoggerConfiguration load(String fileName) throws IOException, FileConfigurationException;
}
