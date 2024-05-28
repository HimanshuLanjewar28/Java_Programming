package JAVA_Basics.practice_Questions;

import java.util.*;
public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the income: ");
        int income = sc.nextInt();
        int tax;

        if(income <= 500000){
            tax  = 0;
            System.out.println("0% tax is applies on "+ income + " which is: "+ tax);
        }
        else if(income > 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
            System.out.println(("20% tax applies on "+ income + " which is: " + tax));
        }
        else if(income > 1000000){
            tax = (int) (income * 0.3);
            System.out.println("30% tax applies on "+ income + " which is: " + tax);
        }
        sc.close();
    }
}
