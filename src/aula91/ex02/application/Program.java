package aula91.ex02.application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double avg;
        double sum = 0.0;

        System.out.print("How many numbers will you enter? ");

        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i < vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();

            sum += vect[i];
        }

        System.out.println();
        System.out.println("VALUES = " + Arrays.toString(vect));
        System.out.printf("SUM = %.2f%n", sum);
        avg = sum/ vect.length;
        System.out.printf("AVERAGE: %.2f%n", avg);
        sc.close();
    }
}
