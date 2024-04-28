package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger;

import ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.constants.ConfigParsePatterns;
import ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.exceptions.FileConfigurationException;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StdoutLoggerConfigurationLoader extends LoggerConfigurationLoader {
    @Override
    public StdoutLoggerConfiguration load(String fileName) throws IOException, FileConfigurationException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            LoggingLevel level = null;
            String format = "";
            String str;
            StringBuilder rawConfig = new StringBuilder();
            try {
                while ((str = br.readLine()) != null) {
                    rawConfig.append(str).append("\n");
                }
                if (rawConfig.isEmpty()) {
                    throw new FileConfigurationException("Error: Config file empty");
                }
                String levelStr = findPattern(ConfigParsePatterns.LEVEL, rawConfig.toString());
                if (levelStr == null) {
                    throw new FileConfigurationException("Error: No logging level found in configuration file");
                } else if (levelStr.equalsIgnoreCase("INFO")) {
                    level = LoggingLevel.INFO;
                } else if (levelStr.equalsIgnoreCase("DEBUG")) {
                    level = LoggingLevel.DEBUG;
                } else {
                    throw new FileConfigurationException("Error: Logging level \"" + levelStr + "\" is not supported");
                }
                format = findPattern(ConfigParsePatterns.FORMAT, rawConfig.toString());
                if (format == null) {
                    throw new FileConfigurationException("Error: No FORMAT found in configuration file.");
                }
            } catch (IOException e) {
                System.out.println("IO exception: " + e.getMessage());
            }
            return new StdoutLoggerConfiguration(level, format);
        } catch (FileNotFoundException e) {
            System.out.println("File not found! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO exception: " + e.getMessage());
        }
        throw new FileConfigurationException("Issues with BufferReader");
    }


    private String findPattern(String regex, String inputStr) {
        String result = null;
        Pattern lookupPattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = lookupPattern.matcher(inputStr);
        if (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }
}
