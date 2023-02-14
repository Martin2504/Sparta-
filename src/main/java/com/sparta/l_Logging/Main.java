package com.sparta.l_Logging;

import java.util.logging.*;

public class Main {
    public static final Logger logger = Logger.getLogger(Main.class.getName());     // create logger

    public static void main(String[] args) {
        FileHandlerConfig.getFileHandler();
        ConsoleHandler consoleHandler = ConsoleHandlerConfig.getConsoleHandler();
        LoggerConfig.getLogger(consoleHandler);
    }


}
