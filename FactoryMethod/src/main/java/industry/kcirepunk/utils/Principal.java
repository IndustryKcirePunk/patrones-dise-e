package industry.kcirepunk.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Principal {

    public static void main(String[] args) {

        Properties properties= new Properties();
        try {
            properties.load(new FileInputStream(new File("test.properties")));

            System.out.println(properties.get("user"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}