package exaula52.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            double x = sc.nextDouble();
            double x2 = sc.nextDouble();
            double x3 = sc.nextDouble();

            double mediaPonderada = (x*2.0 + x2*3.0 + x3*5.0) / 10.0;

            System.out.printf("%.1f%n", mediaPonderada);
        }

        sc.close();
    }
}
