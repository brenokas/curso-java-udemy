package aula91.ex09.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many people will you enter? ");
        int n = sc.nextInt();
        
        int[] people = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];
        
        int oldestAge = age[0];
        String oldestName = name[0];

        for(int i=0; i<people.length; i++) {
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
        
            if (age[i] > oldestAge) {
                oldestName = name[i];
                oldestAge = age[i];
            }

        }

        System.out.printf("Oldest person: %s%n", oldestName);
    
        sc.close();
    }
}
