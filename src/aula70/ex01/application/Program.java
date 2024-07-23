package aula70.ex01.application;

import aula70.ex01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();
    }
}
