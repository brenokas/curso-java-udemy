package aula91.ex03.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int underSixteen = 0;
        double avgUnderSixteen = 0.0;
        double sumHeight = 0.0;
        double avgHeight;

        System.out.print("How many people will be entered? ");
        n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i=0; i < n; i++) {
            switch(i){
                case 0:
                    System.out.println("1st person data:");
                    break;
                case 1:
                    System.out.println("2nd person data:");
                    break;
                case 2:
                    System.out.println("3rd person data:");
                    break;
                default:
                    System.out.printf("%dth person data:\n", i+1);
            }

            System.out.print("Name: ");
            sc.nextLine();
            name[i] = sc.nextLine();

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            if (age[i] < 16) underSixteen++;

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
            sumHeight += height[i];
        }

        avgHeight = sumHeight / n;
        avgUnderSixteen = ((double)underSixteen / n) * 100;

        System.out.println();
        System.out.printf("Average height = %.2f\n", avgHeight);
        System.out.printf("People under 16 years old: %.1f%%\n", avgUnderSixteen);

        for (int i=0; i < n; i++) {
            if (age[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }

        sc.close();
    }
}
