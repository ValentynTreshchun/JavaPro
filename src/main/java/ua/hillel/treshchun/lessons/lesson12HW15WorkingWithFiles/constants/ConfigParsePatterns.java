package ua.hillel.treshchun.lessons.lesson12HW15WorkingWithFiles.constants;

public class ConfigParsePatterns {
    public static final String PATH = "FILE:\\s(.+)\\n";
    public static final String LEVEL = "LEVEL: (.+)\\n";
    public static final String MAX_SIZE = "MAX-SIZE: (.+)\\n";
    public static final String FORMAT = "FORMAT: (.+)\\n";

    private ConfigParsePatterns() {
    }
}
