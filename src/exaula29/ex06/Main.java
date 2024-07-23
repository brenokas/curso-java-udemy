package exaula29.ex06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double aT = (a*c)/2;
        System.out.printf("TRIANGULO: %.3f%n", aT);

        double aC, pi;
        pi = 3.14159;
        aC = pi*Math.pow(c, 2);
        System.out.printf("CIRCULO: %.3f%n", aC);

        double aTr;
        aTr = ((a+b) * c) / 2;
        System.out.printf("TRAPEZIO: %.3f%n", aTr);

        double aQ;
        aQ = b*b;
        System.out.printf("QUADRADO: %.3f%n", aQ);

        double aR;
        aR = a*b;
        System.out.printf("RETANGULO: %.3f", aR);

        sc.close();
    }
}
