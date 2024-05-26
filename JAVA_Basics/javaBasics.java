
package JAVA_Basics;
import java.util.*;

public class javaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal value: ");
        float price = sc.nextFloat();
        System.out.println("You entered the decimal value: " + price);
        sc.close();
    }
}