package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles;

import ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.exceptions.FileConfigurationException;
import ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger.*;

import java.io.IOException;

public class HW15 {
    public static void main(String[] args) {
        String filePath = "src\\main\\java\\ua\\" +
                "hillel\\treshchun\\lessons\\lesson12HW15WorkingWithFiles\\configs\\FileLoggerConfiguration2.txt";
        FileLoggerConfiguration config;
        FileLoggerConfigurationLoader configLoader = new FileLoggerConfigurationLoader();

        StdoutLoggerConfiguration stdConfig;
        StdoutLoggerConfigurationLoader stdConfLoader = new StdoutLoggerConfigurationLoader();

        try {
            config = configLoader.load(filePath);
            stdConfig = stdConfLoader.load(filePath);
            Logger fileLog = new FileLogger(config);
            Logger stdLog = new StdoutLogger(stdConfig);
            System.out.println("FileLogger running, config: " + "\n" + config);
            System.out.println("StdOutLogger running, config: " + "\n" + stdConfig);

            for (int i = 0; i < 10; i++) {
                fileLog.debug("entry " + i + " Debug message");
                stdLog.debug("entry " + i + " Debug message");
                fileLog.info("entry " + i + " Info message");
                stdLog.info("entry " + i + " Debug message");
            }
        } catch (FileConfigurationException e) {
            System.out.println("Issue with file, details: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
