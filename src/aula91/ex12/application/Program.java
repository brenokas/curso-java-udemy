package aula91.ex12.application;

import java.util.Scanner;

import aula91.ex12.entities.Rent; 

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] rooms = new Rent[10];

        for (int i=0; i < n; i++) {
            System.out.println();
            System.out.printf("Rent #%d:%n", i+1);
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            rooms[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        
        for (int i=0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }
        
        sc.close();
    }
}
