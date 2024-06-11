package JAVA_Basics.Functions;
import java.util.*;

public class basicFunction {

    // public static void printHello(){
    //     for(int i=1;i<=10;i++){
    //     System.out.println("Hello World " + i);
    //     }
    // }
    
    
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("sum of two numbers is: " + sum);
        sc.close();
    }
}
