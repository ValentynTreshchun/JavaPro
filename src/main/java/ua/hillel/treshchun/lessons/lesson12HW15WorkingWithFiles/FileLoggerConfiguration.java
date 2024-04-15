package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles;

import java.time.LocalDateTime;

public class FileLoggerConfiguration implements LoggerConfiguration {
    private String filePath;
    private LoggingLevel level;
    private int sizeLimitBytes;
    private String fileFormat;

    public FileLoggerConfiguration(String filePath, LoggingLevel level, int sizeLimitBytes, String fileFormat) {
        this.level = level;
        StringBuilder filePatheBuilder = new StringBuilder();
        filePatheBuilder.append(filePath)
                .append("01_LogFile_")
                .append(LocalDateTime.now().getDayOfMonth())
                .append("_")
                .append(LocalDateTime.now().getMonth())
                .append("_")
                .append(LocalDateTime.now().getYear())
                .append("_")
                .append(LocalDateTime.now().getHour())
                .append("h_")
                .append(LocalDateTime.now().getMinute())
                .append("m_")
                .append(LocalDateTime.now().getSecond())
                .append("s.txt");
        this.filePath = filePatheBuilder.toString();
        this.fileFormat = fileFormat;
        this.sizeLimitBytes = sizeLimitBytes;
    }

    public void createNewFileUponLimitReached() {
        StringBuilder filePatheBuilder = new StringBuilder(filePath);
        int nameChangeIndex = filePatheBuilder.indexOf("_LogFile") - 2;
        int newNumber = Integer.valueOf(filePatheBuilder.substring(nameChangeIndex, nameChangeIndex + 2)) + 1;
        StringBuilder instertString = new StringBuilder();
        if (newNumber < 10) {
            instertString.append("0").append(newNumber);
        } else {
            instertString.append(newNumber);
        }
        filePatheBuilder.replace(nameChangeIndex, nameChangeIndex + 2, instertString.toString());
        filePath = filePatheBuilder.toString();
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public int getSizeLimitBytes() {
        return sizeLimitBytes;
    }

    @Override
    public String toString() {
        return "FileLoggerConfiguration{" +
                "\n     filePath='" + filePath + '\'' +
                "\n     level=" + level +
                "\n     sizeLimitBytes=" + sizeLimitBytes +
                "\n     fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
