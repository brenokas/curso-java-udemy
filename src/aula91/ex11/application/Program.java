package aula91.ex11.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double averageWomanHeight = 0.0, sumWomanHeight = 0.0;
        int countMan = 0, countWoman = 0;
        
        System.out.print("How many people will be entered? ");
        int n = sc.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        for (int i=0; i<n; i++) {
            switch(i){
                case 0:
                    System.out.print("1st person height: ");
                    height[i] = sc.nextDouble();
                    System.out.print("1st person gender: ");
                    gender[i] = sc.next().charAt(0);
                    break;
                case 1:
                    System.out.print("2nd person height: ");
                    height[i] = sc.nextDouble();
                    System.out.print("2nd person gender: ");
                    gender[i] = sc.next().charAt(0);
                    break;
                case 2:
                    System.out.print("3rd person height: ");
                    height[i] = sc.nextDouble();
                    System.out.print("3rd person gender: ");
                    gender[i] = sc.next().charAt(0);
                    break;
                default:
                    System.out.printf("%dst person height: ", i+1);
                    height[i] = sc.nextDouble();
                    System.out.printf("%dst person gender: ", i+1);
                    gender[i] = sc.next().charAt(0);
            }
            
            if (gender[i] == 'M') {
                countMan++;
            } else {
                countWoman++;
                sumWomanHeight += height[i];
            }
        }
        
        double smallest = height[0];
        double higher = height[0];

        for (int i=0; i<height.length; i++) {
            if (height[i] > higher) higher = height[i];
            if (height[i] < smallest) smallest = height[i];
        }
        
        averageWomanHeight = sumWomanHeight / countWoman; 

        System.out.printf("Smaller height: %.2f%n", smallest);
        System.out.printf("Higher height: %.2f%n", higher);
        System.out.printf("Average woman height: %.2f%n", averageWomanHeight);
        System.out.printf("Number of mans = %d%n", countMan);

        sc.close();
    }
}
