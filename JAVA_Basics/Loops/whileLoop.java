package JAVA_Basics.Loops;
import java.util.*;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int count = 1;

        while (count <= num) {
            System.out.println(count);
            count++ ;            
        }
        sc.close();
    }
}
