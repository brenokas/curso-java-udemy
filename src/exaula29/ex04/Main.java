package exaula29.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number, hours;
        double perHour, salary;

        number = sc.nextInt();
        hours = sc.nextInt();
        perHour = sc.nextDouble();

        salary = hours*perHour;

        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$%.2f", salary);
        sc.close();
    }
}
