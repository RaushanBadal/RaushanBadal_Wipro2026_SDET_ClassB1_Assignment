package Day11_filehandling;

import java.io.*;


public class DeserializationDemo {

    public static void main(String[] args) {

        try {

            
            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("badal.txt"));

           
            Student s1 = (Student) ois.readObject();

           
            System.out.println("Student ID : " + s1.id);
            System.out.println("Student Name : " + s1.name);

            ois.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}