package JAVA_Basics.Operators;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the the number:");
        int num = sc.nextInt();

        String numType = (num % 2 == 0)? "even" : "odd" ;
        System.out.println(numType);
        sc.close();
    }
}
