package com.jtfr.chapter225;

import java.util.logging.Logger;

public class TestMain {

    private static Logger LOGGER = Logger.getLogger(TestMain.class.getName());
    public void get(){
        LOGGER.info("info");
        LOGGER.warning("warning");
    }

    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        testMain.get();
    }
}
