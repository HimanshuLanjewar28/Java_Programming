package JAVA_Basics.practice_Questions;
import java.util.*;

public class sumofNumbers {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=num; i++){
            sum = sum + i;
        }
        System.out.print("The sum of natural numbers till "+ num + " is: "+sum);
        sc.close();
    }
}
