package JAVA_Basics.Patterns;

import java.util.*;
public class que1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of pattern: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            System.out.println("****");
        }
        sc.close();
    }
}
