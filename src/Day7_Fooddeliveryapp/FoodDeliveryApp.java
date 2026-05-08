package Day7_Fooddeliveryapp;

class Order implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Order is being prepared...");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Order thread interrupted");
        }
    }
}

class Payment implements Runnable {
    public void run() {
        System.out.println("Payment is being processed...");
    }
}

class Notification implements Runnable {
    public void run() {
        System.out.println("Notification sent to user 📲");
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        
        Order orderTask = new Order();
        Payment paymentTask = new Payment();
        Notification notificationTask = new Notification();

        Thread t1 = new Thread(orderTask);
        Thread t2 = new Thread(paymentTask);
        Thread t3 = new Thread(notificationTask);

        try {
            t1.start();
            t1.join();   // wait until Order completes

            t2.start();
            t2.join();   // wait until Payment completes

            t3.start();  // Notification runs last

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
