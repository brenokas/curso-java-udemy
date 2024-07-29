package aula163.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula163.entities.ImportedProduct;
import aula163.entities.Product;
import aula163.entities.UsedProduct;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported? (c/u/i): ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: $");
            double price = sc.nextDouble();
        
            if (ch == 'i') {
                System.out.print("Customs fee: $");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, manufactureDate));
            } else products.add(new Product(name, price));

        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
