package JAVA_Basics.Functions;

import java.util.*;
public class productQue {
    
    public static int prooductOfTwoNumbers(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int product = prooductOfTwoNumbers(number1, number2);
        System.out.println("Product of the two numbers is: " + product);
        sc.close();
    }
}
