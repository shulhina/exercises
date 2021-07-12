package day12.exercise1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2HelloWorld {

    private final static Logger Logger = LogManager.getLogger(Log4j2HelloWorld.class);

    public static void main(String[] args) {
        Logger.trace("trace message");
        Logger.debug("debug message");
        Logger.info("info message");
        Logger.error("error message");
    }
}
