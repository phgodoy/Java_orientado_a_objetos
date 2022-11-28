
package com.mycompany.dolarprice;

import java.util.Scanner;

public class DolarPrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.println("Wow many dollars will be bought?");
        double dollarQuant = sc.nextDouble();
        double value = CurrencyConverter.payDollar(dollarPrice, dollarQuant);
        System.out.printf("Amount to be paid in reais = %.2f%n", value);
    }
}
