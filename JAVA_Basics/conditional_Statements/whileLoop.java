package JAVA_Basics.conditional_Statements;

import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        // int i=0;
        // while(i<100){
        //     System.out.println("Hello World " + i);
        //     i++;
        // }


        // Q. print numbers from 1 to n     where n = 7
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 1;
        while( count <= num){
            System.out.println(count);
            count++; 
        }
        sc.close();
    }
}
