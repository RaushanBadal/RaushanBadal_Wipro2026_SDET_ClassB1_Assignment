package Day1_assignment;

public class Ecommerce5 {

	public static void main(String[] args) {
		String productName = "Wireless Headphones";
		double productPrice = 199.99;
		int productQuantity = 15;
		boolean isAvailable = true;
		System.out.println("E-Commerce Product Details");
		System.out.println("Product Name: " + productName);
		System.out.println("Price       :" + productPrice);
		System.out.println("Quantity    : " + productQuantity);
		System.out.println("In Stock    : " + (isAvailable ? "Yes" : "No"));
		}
	}
