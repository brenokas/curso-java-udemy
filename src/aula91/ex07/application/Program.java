package aula91.ex07.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        double avg;

        System.out.print("How many elements will the vector have? ");
        int elements = sc.nextInt();

        double[] vect = new double[elements];

        for(int i=0; i < vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        avg = sum / elements;
        System.out.printf("Vector mean: %.3f%n", avg);

        System.out.println("Elements under the average:");
        for (double v : vect) {
            if (v < avg) {
                System.out.printf("%.1f\n", v);
            }
        }
        sc.close();
    }
}
