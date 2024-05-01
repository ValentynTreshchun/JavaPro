package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger;

import ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.exceptions.FileConfigurationException;

import java.io.IOException;

public abstract class LoggerConfigurationLoader {
    public abstract LoggerConfiguration load(String fileName) throws IOException, FileConfigurationException;
}
