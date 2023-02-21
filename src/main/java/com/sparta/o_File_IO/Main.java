package com.sparta.o_File_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    private static BufferedReader reader = null;
    public static void main(String[] args) {
        try (var file = new FileReader("src/main/resources/deniro.csv")) {
            reader = new BufferedReader(file);
            String line = reader.readLine();
            // will read the file line by line
            while (line != null) {
                String[] s = line.split(" ");
                logger.log(Level.INFO, Arrays.toString(s));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
