package JAVA_Basics.Functions;

import java.util.*;
public class decimalToBinary {
    
    public static void decToBin(int decNum){
        int decimalNum = decNum;
        int pow = 0;
        int binNum=0;

        while(decNum >0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }

        System.out.println("Binary number of "+decimalNum+" is: "+binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int decNum = sc.nextInt();
        decToBin(decNum);
        sc.close();
    }
}
