package aula178.application;

import aula178.model.entities.Account;
import aula178.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("Initial balance: ");
        double accountInitialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double accountWithdrawLimit = sc.nextDouble();

        Account acc = new Account(accountNumber, accountHolder, accountInitialBalance, accountWithdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amountWithDraw = sc.nextDouble();

        try {
            acc.withdraw(amountWithDraw);
            System.out.printf("-> New balance: %.2f", acc.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }
}
