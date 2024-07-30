package aula166.app;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import aula166.entities.Company;
import aula166.entities.Individual;
import aula166.entities.TaxPayer;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<TaxPayer> taxpayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company? (i/c): ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                taxpayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();

                taxpayers.add(new Company(name, anualIncome, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        
        double sum = 0.0;

        for (TaxPayer taxpayer : taxpayers) {
            System.out.println(taxpayer.getName() + ": $" + String.format("%.2f", taxpayer.tax()));
            sum += taxpayer.tax();
        }
        
        System.out.println();
        System.out.printf("TOTAL TAXES: $%.2f%n", sum);

        sc.close();
    }

}
