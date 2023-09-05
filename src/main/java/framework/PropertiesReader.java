// Sample PropertiesReader.java
package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static final String PROPERTY_FILE_PATH = "src/main/resources/test.properties";

    public static String getBrowser() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(PROPERTY_FILE_PATH);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("browser");
    }
}
