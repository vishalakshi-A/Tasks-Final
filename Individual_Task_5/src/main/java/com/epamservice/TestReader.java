package com.epamservice;

import java.util.ResourceBundle;

public class TestReader {
    private static final ResourceBundle resourceBundle=ResourceBundle.getBundle(System.getProperty("env"));
    public static String getTestData(String key)
    {
        return resourceBundle.getString(key);
    }

}
