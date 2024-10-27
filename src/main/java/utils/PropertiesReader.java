package utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public static String readData(String key) {
        Properties properties = new Properties();
        String value = "";
        try (InputStream inputStream = PropertiesReader.class.getClassLoader().getResourceAsStream("properties/config.properties")) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Properties file not found!");
            }
            properties.load(inputStream);
            value = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    public static void writeTestData(String key, String value) {

        Properties properties = new Properties();
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("src/test/resources/properties/testData.properties");
            properties.setProperty(key,value);
            properties.store(fileOutputStream,null);

            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readTestData(String key) {
        Properties properties = new Properties();
        String value = "";
        try (InputStream inputStream = PropertiesReader.class.getClassLoader().getResourceAsStream("properties/testData.properties")) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Properties file not found!");
            }
            properties.load(inputStream);
            value = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
