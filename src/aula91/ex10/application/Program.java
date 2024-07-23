package aula91.ex10.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hoy many students will be entered? ");
        int n = sc.nextInt();

        String name[] = new String[n];
        double firstGrade[] = new double[n];
        double secondGrade[] = new double[n];
        double average[] = new double[n];

        for (int i=0; i < n; i++) {
            switch(i){
                case 0:
                    System.out.println("Enter the name, first and second grade from the 1st student:");
                    break;
                case 1:
                    System.out.println("Enter the name, first and second grade from the 2nd student:");
                    break;
                case 2:
                    System.out.println("Enter the name, first and second grade from the 3rd student:");
                    break;
                default:
                    System.out.printf("Enter the name, first and second grade from the %dth student", i+1);
            }
        
            sc.nextLine();
            name[i] = sc.nextLine();
            firstGrade[i] = sc.nextDouble();
            secondGrade[i] = sc.nextDouble();
        
            average[i] = (firstGrade[i] + secondGrade[i]) / 2;

        }
        
        System.out.println("Approved students:");

        for (int i=0; i < average.length; i++) {
            if (average[i] > 6.0) {
                System.out.println(name[i]);
            }
        }
        
        sc.close();
    }
}
