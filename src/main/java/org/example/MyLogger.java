package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
    private static final Logger logger = Logger.getLogger(MyLogger.class.getName());

    private MyLogger(){}
    public static void log(String message) {
        logger.log(Level.INFO, message);
    }


}

