package aula91.ex08.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, evenNumbers = 0;

        System.out.print("How many elements will the vector have? ");
        int elements = sc.nextInt();

        int[] vect = new int[elements];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                sum += vect[i];
                evenNumbers++;
            }
        }

        if (evenNumbers > 0) {
            double avg = (double)sum/evenNumbers;
            System.out.printf("Average of even numbers: %.1f%n", avg);
        }else {
            System.out.println("No even numbers!");
        }


        sc.close();
    }
}
