package com.saksoft.poc;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadFileNameFromFolder {
    public static void main(String[] args) {
        String localPath = null;
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/application.properties")) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            localPath = properties.getProperty("PATH");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        if (localPath != null) {
            System.out.println("PATH: " + localPath);
        } else {
            System.out.println("Failed to load PATH from properties file.");
        }

        String filePath = new StringBuilder()
                .append(localPath)
                .append("\\")
                .append("<<Replacement>>")
                .append(";").toString();

        if (localPath != null) {
            File directory = new File(localPath);
            File[] listOfFiles = directory.listFiles();
            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    String dynamicFilePath = filePath.replace("<<Replacement>>", file.getName());
                    System.out.println(dynamicFilePath);
                }
            }
        }
    }
}
