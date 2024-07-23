package aula49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int y=0; y<N; y++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }
}
