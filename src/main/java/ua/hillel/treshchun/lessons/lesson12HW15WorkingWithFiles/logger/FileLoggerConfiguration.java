package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.logger;

import java.time.LocalDateTime;

public class FileLoggerConfiguration extends LoggerConfiguration {
    private String filePath;
    private int sizeLimitBytes;

    public FileLoggerConfiguration(String filePath, LoggingLevel level, int sizeLimitBytes, String fileFormat) {
        super.setLevel(level);
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
        super.setOutputFormat(fileFormat);
        this.sizeLimitBytes = sizeLimitBytes;
    }

    public void createNewFileUponLimitReached() {
        StringBuilder filePathBuilder = new StringBuilder(filePath);
        int nameChangeIndex = filePathBuilder.indexOf("_LogFile") - 2;
        int newNumber = Integer.parseInt(filePathBuilder.substring(nameChangeIndex, nameChangeIndex + 2)) + 1;
        StringBuilder instertString = new StringBuilder();
        if (newNumber < 10) {
            instertString.append("0").append(newNumber);
        } else {
            instertString.append(newNumber);
        }
        filePathBuilder.replace(nameChangeIndex, nameChangeIndex + 2, instertString.toString());
        filePath = filePathBuilder.toString();
    }

    public String getFilePath() {
        return filePath;
    }

    public int getSizeLimitBytes() {
        return sizeLimitBytes;
    }

    @Override
    public String toString() {
        return "FileLoggerConfiguration{" +
                "\n     filePath='" + filePath + '\'' +
                "\n     level=" + super.getLevel() +
                "\n     sizeLimitBytes=" + sizeLimitBytes +
                "\n     fileFormat='" + super.getFormat() + '\'' +
                '}';
    }
}
