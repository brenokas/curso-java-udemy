package aula91.ex06.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        //Catching vector A values
        System.out.println("Enter the vector A values:");
        int[] vectA = new int[n];

        for (int i=0; i< vectA.length; i++){
            vectA[i] = sc.nextInt();
        }

        //Catching vector B values
        System.out.println("Enter the vector B values:");
        int[] vectB = new int[n];

        for (int i=0; i< vectB.length; i++){
            vectB[i] = sc.nextInt();
        }

        //Adding the values into another vector
        int[] vectC = new int[n];

        System.out.println("Resulting vector:");

        for(int i=0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
