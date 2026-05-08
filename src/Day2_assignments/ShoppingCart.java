package Day2_assignments;

public class ShoppingCart {
    public static void main(String[] args) {
        int prices[] = {100, 200, 300, 0};
        int i = 0;
        int total = 0;

        while (prices[i] != 0) {
            total = total + prices[i];
            i++;
        }

        System.out.println("Total Amount: " + total);
    }
}