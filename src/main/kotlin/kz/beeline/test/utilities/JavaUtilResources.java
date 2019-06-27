package kz.beeline.test.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtilResources {
    private static Properties properties;

    private static void loadProperties(){
        try{
            properties = new Properties();
            properties.load(new FileInputStream("config.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }





    public static String getProperties(String property){
        loadProperties();
        return properties.getProperty(property);
    }
}
