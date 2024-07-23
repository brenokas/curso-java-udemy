package aula91.ex05.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers will you enter? ");
        n = sc.nextInt();

        double[] vect = new double[n];
        double highestValue = vect[0];
        int highestPosition = 0;

        for(int i =0; i < vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
            if (vect[i] > highestValue) {
                highestValue = vect[i];
                highestPosition= i;
            }
        }

        System.out.print("Highest value: ");
        System.out.println(highestValue);

        System.out.print("Position of highest number: ");
        System.out.println(highestPosition);

        sc.close();
    }
}
