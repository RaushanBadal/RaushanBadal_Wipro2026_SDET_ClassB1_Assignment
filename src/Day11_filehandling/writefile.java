package Day11_filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writefile {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("badal.txt");

            writer.write("Welcome to Java IO Classes");

            writer.write("\nLearning File Handling");

            writer.close();

            System.out.println("Data Written Successfully");

        } catch (IOException e) {

            System.out.println(e);
        }
    }
}
