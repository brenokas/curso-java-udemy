package exaula52.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão impossível!%n");
            } else {
                double div = (double) a/b;
                System.out.printf("%.1f%n", div);
            }

        }

        sc.close();
    }
}
