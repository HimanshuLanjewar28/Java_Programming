package JAVA_Basics.conditional_Statements;

import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Person can drive and vote!!");
        }
        if (age>13 && age<18) {
            System.out.println("Person is the teenager!!");
        }
        else{
            System.out.println("Person can't drive and vote!!");
        }
        sc.close();
    }
}
