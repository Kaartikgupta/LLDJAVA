package main.java.com.lld.logger;

public class Log {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        logger.log("This is an info message.", LogLevel.INFO);
        logger.log("This is a debug message.", LogLevel.DEBUG);
        logger.log("This is an error message.", LogLevel.ERROR);
    }
}
