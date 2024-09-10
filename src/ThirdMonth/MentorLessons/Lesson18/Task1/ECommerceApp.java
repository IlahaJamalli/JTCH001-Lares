package ThirdMonth.MentorLessons.Lesson18.Task1;

import java.util.Scanner;

public class ECommerceApp {

    public static void main(String[] args) {

        ProductCatalog catalog=new ProductCatalog(10);
        PaymentProcessor paymentProcessor=new PaymentProcessor();

        catalog.addProduct(new Product("111", "Laptop", 1000.0, 10));
        catalog.addProduct(new Product("222", "Smartphone", 500.0, 20));
        catalog.addProduct(new Product("333", "Headphones", 100.0, 50));

        Order order=new Order();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter product Id: ");
        String productId=scan.next();
        System.out.println("Enter quantity: ");
        int quantity= scan.nextInt();
        order.addProduct(productId, quantity);

        order.orderProduct(catalog, paymentProcessor);

    }

}
