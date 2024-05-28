package JAVA_Basics.practice_Questions;

import java.util.*;
public class even_odd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is an Even number");
        }
        else{
            System.out.println(num + " is not an even number");
        }
        sc.close();
    }
}
