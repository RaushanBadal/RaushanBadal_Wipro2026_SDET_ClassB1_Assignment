package Day12_Assignments;
import java.io.*;

class Employee implements Serializable {

 int id;
 String name;
 double salary;

 Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }
}

public class EmployeeManagement {

 public static void main(String[] args) {

     try {

       
         File file = new File("employee.txt");

         if (file.createNewFile()) {
             System.out.println("File Created Successfully");
         } else {
             System.out.println("File Already Exists");
         }

        
         Employee emp = new Employee(101, "Raushan", 22400);

       
         ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(file));

         oos.writeObject(emp);

         oos.close();

         System.out.println("Employee Object Saved Successfully");

        
         ObjectInputStream ois =
                 new ObjectInputStream(
                 new FileInputStream(file));

         Employee e = (Employee) ois.readObject();

         System.out.println("\nEmployee Details:");
         System.out.println("ID      : " + e.id);
         System.out.println("Name    : " + e.name);
         System.out.println("Salary  : " + e.salary);

         ois.close();

     } catch (Exception e) {
         System.out.println(e);
     }
 }
}
