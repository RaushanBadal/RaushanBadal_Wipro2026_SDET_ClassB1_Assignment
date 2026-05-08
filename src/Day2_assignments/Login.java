package Day2_assignments;
public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}