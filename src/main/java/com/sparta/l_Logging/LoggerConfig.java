package com.sparta.l_Logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class LoggerConfig {
    static void getLogger(ConsoleHandler consoleHandler) {
        Main.logger.addHandler(consoleHandler);
        Main.logger.setUseParentHandlers(false);
        Main.logger.setLevel(Level.ALL);
        Main.logger.log(Level.INFO, "Hello This is an info message");
        Main.logger.log(Level.WARNING, "This is an warning message");
        Main.logger.log(Level.FINE, "This is an fine message");
    }
}
