package program;

import entities.ContaBancaria;

import java.io.Console;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        ContaBancaria contaCriada1 = null;
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter account holder: ");
        String name = input.nextLine();
        System.out.print("Is there any intial deposit (y/n)? ");
        String initialDeposit = input.nextLine().toLowerCase();
        System.out.println();

        while (initialDeposit.length() != 1) {
            System.out.println("You must choose (y)yes or (n)no.");
            System.out.print("Is there any intial deposit (y/n)? ");
            initialDeposit = input.nextLine().toLowerCase();
        }

        while (initialDeposit.length() == 1) {
            if (initialDeposit.charAt(0) == 'y') {
                System.out.print("Enter a deposit value: ");
                double deposit = input.nextDouble();
                System.out.println();
                contaCriada1 = new ContaBancaria(accountNumber, name, deposit);
                break;
            }
            else if (initialDeposit.charAt(0) == 'n'){
                contaCriada1 = new ContaBancaria(accountNumber, name);
                break;
            }
        }

        System.out.println("Account data: ");
        System.out.println(contaCriada1);

        System.out.print("Enter a deposit value: ");
        contaCriada1.depositBalance(input.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(contaCriada1);

        System.out.print("Enter a withdraw value: ");
        contaCriada1.withdrawBalance(input.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(contaCriada1);

    }
}

