package exaula29.ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, n1, n2;
        double p1, p2, total;

        cod1 = sc.nextInt();
        n1 = sc.nextInt();
        p1 = sc.nextDouble();

        cod2 = sc.nextInt();
        n2 = sc.nextInt();
        p2 = sc.nextDouble();

        total = (n1*p1) + (n2*p2);

        System.out.printf("VALOR A PAGAR: R$%.2f", total);

        sc.close();
    }
}
