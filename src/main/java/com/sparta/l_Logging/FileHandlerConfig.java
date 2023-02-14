package com.sparta.l_Logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class FileHandlerConfig {
    static void getFileHandler() {
        try {
            var fileHandler = new FileHandler("src/main/resources/logFile.log", true); // new logs will be added to this file
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());     // formatting the log file with my custom formatter
            Main.logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
