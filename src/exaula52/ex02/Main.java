package exaula52.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int countIn = 0, countOut = 0;

        for (int x=0; x<N; x++) {
            int value = sc.nextInt();

            if (value >= 10 && value <= 20) {
                countIn++;
            } else countOut++;

        }

        System.out.printf("%d in%n%d out", countIn, countOut);

        sc.close();
    }
}
