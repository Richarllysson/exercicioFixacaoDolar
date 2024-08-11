package application;

import java.util.Scanner;
import entities.CurrencyConverter;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price?");
        double exchange = sc.nextDouble();
        System.out.println("Insert the amount of Dollars bought:");
        double bought = sc.nextDouble();
        System.out.printf("Amount to be paid in Reais = %.2f%n", CurrencyConverter.getPaid(exchange, bought));
        
        sc.close();
    } 
}
