package com.company;

import java.io.*;

public class Utils {
    public static void writeDecryptedFile(String fileName, String text) {
        //
    }

    public static String readFileForDecryption(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        var fileInputStream = new FileInputStream(file);

        StringBuilder builder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                builder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

}
