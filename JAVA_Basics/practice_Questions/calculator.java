package JAVA_Basics.practice_Questions;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the first number:");
        int num2 = sc.nextInt();

        System.out.println("Enter the operation you want to perform: ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+' : System.out.println("the sum of "+ num1 +"and " + num2 + " is: " + (num1 + num2));
                break;
            
            case '-' : System.out.println("the subtraction of "+ num1 + " and " + num2 + " is: " + (num1 - num2));
            break;

            case '*' : System.out.println("the multiplication of "+ num1 + " and " + num2 + " is: " + (num1 * num2));
            break;

            case '/' : System.out.println("the division of "+ num1 + " and " + num2 + " is: " + (num1 / num2));
            break;

            case '%' : System.out.println("the modulo of "+ num1 + " and " + num2 + " is: " + (num1 % num2));
            break;
        
            default : System.out.println("You entered the wrong operation!!"); 
                break;

        
        }
        sc.close();
    }
}
