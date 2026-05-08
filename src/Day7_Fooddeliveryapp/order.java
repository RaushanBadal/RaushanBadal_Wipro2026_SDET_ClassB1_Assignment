package Day7_Fooddeliveryapp;

class FoodTask implements Runnable {

    private String taskName;

    public FoodTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            System.out.println(taskName + " started");

            Thread.sleep(1000);
            System.out.println(taskName + " in progress...");

            Thread.sleep(1000);
            System.out.println(taskName + " almost done...");

            Thread.sleep(1000);
            System.out.println(taskName + " completed");

        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted");
        }
    }
}

public class order {

    public static void main(String[] args) {

        Thread t1 = new Thread(new FoodTask("Order Processing"));
        Thread t2 = new Thread(new FoodTask("Payment Processing"));
        Thread t3 = new Thread(new FoodTask("Notification"));

        t1.start();
        t2.start();
        t3.start();
    }
}