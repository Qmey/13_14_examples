package java14_themes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkingWithFiles {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

