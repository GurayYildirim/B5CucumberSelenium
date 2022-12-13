package com.eurotech.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;
    //Bu bir java classi ve biz burada bir objekt olusturduk

    static {

        try {
            // what file to read
            String path = "configuration.properties"; //buradaki Path isimden verilmis.
            //bu dosya isminde "configuration" önemli degil, uzantisi "properties" önemli
            // read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            // properties --> class that store properties in key / value format
            properties = new Properties();
            // the values from the file input is loaded / fed in to the properties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String get(String keyName){//burada key anahtar kelime ile degerini istiyoruz.
        return properties.getProperty(keyName);
    }
}
