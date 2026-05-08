package Day2_assignments;

public class Employee {
    public static void main(String[] args) {
        double salary[] = {20000, 25000, 30000};

        for (int i = 0; i < salary.length; i++) {
            salary[i] = salary[i] + 2000;
            System.out.println("Updated Salary: " + salary[i]);
        }
    }
}
