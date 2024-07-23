package aula91.ex04.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int evenNumbers = 0;

        System.out.print("How many numbers will you enter? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Even numbers: ");

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                evenNumbers++;
            }
        }

        System.out.println();
        System.out.println("Number of even numbers: " + evenNumbers);

        sc.close();
    }
}
