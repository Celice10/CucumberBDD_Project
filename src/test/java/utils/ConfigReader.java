package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    static {                             // Static block to load properties when the class is loaded

        prop = new Properties();         // Create a Properties object to hold the configuration properties
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");   // Load the properties file using FileInputStream
            prop.load(file);                                                                            // Load the properties from the file into the Properties object

        } catch (Exception e) {                                 // Handle any exceptions that may occur during file loading
            e.printStackTrace();
        }

    }

    public static String getBrowser() {

        return prop.getProperty("browser");
    }

    public static String getUrl() {

        return prop.getProperty("url");
    }

    public static String getUsername() {

        return prop.getProperty("username");
    }

    public static String getPassword() {

        return prop.getProperty("password");
    }

    public static String getGroupName() {

        return prop.getProperty("groupName");
    }
    public static String getGroupDescription() {

        return prop.getProperty("groupDescription");
    }
        public static String getGroupYear() {

            return prop.getProperty("groupYear");
        }

        public static String getGroupMaxCapacity() {

            return prop.getProperty("groupMaxCapacity");
        }

        public static String getStartDate() {

            return prop.getProperty("startDate");
        }

        public static String getEndDate() {

            return prop.getProperty("endDate");
        }

}
