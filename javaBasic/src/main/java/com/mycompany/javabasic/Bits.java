
package com.mycompany.javabasic;
import java.util.Scanner;

public class Bits {
    
    static void generateBits(){
        Scanner sc = new Scanner(System.in);
        int mask = 0b100000;
        int n = sc.nextInt();
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false");
        }
        sc.close();
    }
}
