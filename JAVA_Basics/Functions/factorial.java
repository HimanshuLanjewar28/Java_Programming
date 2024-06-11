package JAVA_Basics.Functions;
import java.util.*;

public class factorial {

    public static int factorialOfNum(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = factorialOfNum(num);
        System.out.println("Factorial of a given number is: "+fact);
        sc.close();
    }
    
}
