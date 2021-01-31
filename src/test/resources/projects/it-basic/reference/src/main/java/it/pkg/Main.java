package it.pkg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;

public class Main {

    private static final Logger log;

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
        log = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    }

    public static void main(String[] args) {
        log.info("Main class");
    }
}
