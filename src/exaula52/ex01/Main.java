package exaula52.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int y=0; y<x; y++) {
            if (y % 2 != 0) {
                System.out.println(y);
            }
        }

        sc.close();
    }
}
