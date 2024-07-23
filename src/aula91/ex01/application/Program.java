package aula91.ex01.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers will you enter? ");
        System.out.println();

        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NEGATIVE NUMBERS:");
        System.out.println();

        for (int i=0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();
    }
}
