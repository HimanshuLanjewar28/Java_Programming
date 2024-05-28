package JAVA_Basics.practice_Questions;

import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is greater than "+ num2);
        }
        else{
            System.out.println(num1 + " is less than "+ num2);
        }
    }
}
