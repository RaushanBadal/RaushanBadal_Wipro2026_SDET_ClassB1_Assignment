package Day7_Fooddelivery_;

class FoodService {

 
 public synchronized void process(String taskName) {
     try {
         System.out.println(taskName + " started");

         for (int i = 1; i <= 3; i++) {
             System.out.println(taskName + " is processing...");
             Thread.sleep(1000);
         }

         System.out.println(taskName + " completed\n");

     } catch (InterruptedException e) {
         System.out.println(taskName + " interrupted");
     }
 }
}


class FoodDelivery extends Thread {

 FoodService service;

 public FoodDelivery(FoodService service, String name) {
     this.service = service;
     setName(name);
 }

 public void run() {
     service.process(getName());
 }
}


public class multi2 {
 public static void main(String[] args) {

     FoodService service = new FoodService();

     FoodDelivery order = new FoodDelivery(service, "Order Processing");
     FoodDelivery kitchen = new FoodDelivery(service, "Kitchen Preparing");
     FoodDelivery delivery = new FoodDelivery(service, "Delivery");

     order.start();
     kitchen.start();
     delivery.start();
 }
}
