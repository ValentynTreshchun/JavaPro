package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles;

import java.io.*;

public class FileLoggerConfigurationLoader implements LoggerConfigurationLoader {


    public FileLoggerConfiguration load(String fileName) throws FileConfigurationException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String filePath = "";
            LoggingLevel level = null;
            int maxSize = 0;
            String format = "";
            String str;
            StringBuilder strB = new StringBuilder();
            try {
                if ((str = br.readLine()) != null) {
                    while (str.isBlank()) {
                        if ((str = br.readLine()) == null) {
                            throw new FileConfigurationException("File format issue");
                        }
                    }
                    strB.append(str);
                    if (strB.substring(0, 6).equalsIgnoreCase("file: ")) {
                        filePath = strB.substring(6);
                    } else {
                        System.out.println("Error: no file path found in configuration file.");
                        throw new FileConfigurationException("Error: no file path found in configuration file.");
                    }
                }
                if ((str = br.readLine()) != null) {
                    while (str.isBlank()) {
                        if ((str = br.readLine()) == null) {
                            throw new FileConfigurationException("File format issue");
                        }
                    }
                    strB.setLength(0);
                    strB.append(str);
                    if (strB.substring(0, 7).equalsIgnoreCase("LEVEL: ")) {
                        if (strB.substring(7).equalsIgnoreCase("INFO")) {
                            level = LoggingLevel.INFO;
                        } else if (strB.substring(7).equalsIgnoreCase("DEBUG")) {
                            level = LoggingLevel.DEBUG;
                        } else {
                            System.out.println("Error: unsupported logging level found in configuration file: "
                                    + strB.substring(7));
                            throw new FileConfigurationException("Unsupported logging level found in configuration file");
                        }
                    } else {
                        System.out.println("Error: no logging LEVEL found in configuration file.");
                        throw new FileConfigurationException("No logging level found in configuration file.");
                    }
                }
                if ((str = br.readLine()) != null) {
                    while (str.isBlank()) {
                        if ((str = br.readLine()) == null) {
                            throw new FileConfigurationException("File format issue");
                        }
                    }
                    strB.setLength(0);
                    strB.append(str);
                    if (strB.substring(0, 10).equalsIgnoreCase("MAX-SIZE: ")) {
                        try {
                            maxSize = Integer.parseInt(strB.substring(10));
                        } catch (NumberFormatException e) {
                            System.out.println("Incorrect MAX-SIZE number format, default value of 128 used");
                            maxSize = 128;
                        }
                    } else {
                        System.out.println("Error: no MAX-SIZE found in configuration file.");
                        throw new FileConfigurationException("No MAX-SIZE found in configuration file.");
                    }
                }
                if ((str = br.readLine()) != null) {
                    while (str.isBlank()) {
                        if ((str = br.readLine()) == null) {
                            throw new FileConfigurationException("File format issue");
                        }
                    }
                    strB.setLength(0);
                    strB.append(str);
                    if (strB.substring(0, 8).equalsIgnoreCase("FORMAT: ")) {
                        format = strB.substring(8);
                    } else {
                        System.out.println("Error: no FORMAT found in file.");
                        throw new FileConfigurationException("No FORMAT found in configuration file.");
                    }
                }
            } catch (IOException e) {
                System.out.println("IO exception: " + e.getMessage());
            }
            return new FileLoggerConfiguration(filePath, level, maxSize, format);
        } catch (FileNotFoundException e) {
            System.out.println("File not found! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO exception: " + e.getMessage());
        }
        throw new FileConfigurationException("Issues with BufferReader");
    }
}
