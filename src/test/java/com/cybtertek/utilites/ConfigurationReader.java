package com.cybtertek.utilites;

import java.io.FileInputStream;
import java.sql.Driver;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties;

    static {

        try {

            String path = "configuration.properties";
            FileInputStream stream = new FileInputStream(path);
            properties.load(stream);
            stream.close();

        } catch (Exception e){
            e.getStackTrace();
        }

    }

    public static String getProperty(String keyName){

        return properties.getProperty(keyName);
    }
}
