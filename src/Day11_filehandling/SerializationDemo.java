package Day11_filehandling;
import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {

        try {

            Student s1 = new Student(101, "Raushan");

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("badal.txt"));

            oos.writeObject(s1);

            oos.close();

            System.out.println("Object Serialized Successfully");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}