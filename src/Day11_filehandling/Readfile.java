package Day11_filehandling;
import java.io.*;

public class Readfile {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("badal.txt");

            int ch;

            while ((ch = reader.read()) != -1) {

                System.out.println((char) ch);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(e);
        }
    }
}
