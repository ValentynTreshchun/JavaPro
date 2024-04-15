package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles;

public class HW15 {
    public static void main(String[] args) {
        FileLoggerConfiguration config = null;
        try {
            FileLoggerConfigurationLoader configLoader = new FileLoggerConfigurationLoader();
            config = configLoader.load("FileLoggerConfiguration.txt");
        } catch (FileConfigurationException e) {
            System.out.println("Issue with file, details: " + e.getMessage());
        }
        System.out.println(config);
        FileLogger logger = new FileLogger(config);
        for (int i = 0; i < 10; i++) {
            logger.debug("Number " + i + " Debug message");
            logger.info("Number " + i + " Info message");
        }
    }
}
