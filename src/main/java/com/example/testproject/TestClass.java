package com.example.testproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestClass.class);

    public void test(File file) {
        try {
            Scanner dataReader = new Scanner(file);

        } catch (FileNotFoundException ex) {
            LOGGER.error("File not found ", ex);
        }
    }
}
