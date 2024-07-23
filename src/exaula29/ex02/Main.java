package exaula29.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, p, a;
        r = sc.nextDouble();
        p = 3.14159;
        a = p * (Math.pow(r, 2));

        System.out.printf("A=%.4f", a);
        sc.close();
    }
}
