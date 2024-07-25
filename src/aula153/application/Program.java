package aula153.application;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import aula153.entities.enums.OrderStatus;
import aula153.entities.Client;
import aula153.entities.Order;
import aula153.entities.OrderItem;
import aula153.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LocalDateTime dateNow = LocalDateTime.now();

        //get client data
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateInput = sc.next();
        LocalDate birthDate = LocalDate.parse(birthDateInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        //creating a client with entered data
        Client client = new Client(name, email, birthDate);

        //getting order data
        System.out.println();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        //creating a new order with entered data
        Order order = new Order(dateNow, status, client);
        
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: $");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);
        }
        
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
