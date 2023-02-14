package com.sparta.l_Logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class ConsoleHandlerConfig {

    static ConsoleHandler getConsoleHandler() {
        var consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);                 // acts like a filter for a logger
        consoleHandler.setFilter(new CustomFilter());       // setting the filter to my custom filter
        return consoleHandler;
    }
}
