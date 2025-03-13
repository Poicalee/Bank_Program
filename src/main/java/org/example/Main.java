package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;

        boolean Running = true;

        int choice;



        while (Running) {

            System.out.println("BANK");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> showBalance(balance);

                case 2 -> balance = balance + deposit();

                case 3 -> balance = balance - withdraw(balance);

                case 4 -> Running = false;

                default -> System.out.println("Invalid choice");

            }

        }

        sc.close();

        }

        static void showBalance(double balance) {
            System.out.printf("Your balance is: $%.2f\n", balance);
        }

        static double deposit() {
        double amount;
        System.out.print("Enter deposit: $");

        amount = sc.nextDouble();

        if(amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        }
        else{
           return amount;
        }
        }
        static double withdraw(double balance) {
        double amount;
        System.out.print("Enter withdraw: $");

        amount = sc.nextDouble();
        if(amount < 0 || amount > balance) {
            System.out.println("Invalid amount");
            return 0;

        }else {
            return amount;
        }

        }
    }
