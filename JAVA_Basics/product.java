
package JAVA_Basics;
import java.util.*;

public class product {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();
        float product = (num1 * num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        sc.close();
    }
}
