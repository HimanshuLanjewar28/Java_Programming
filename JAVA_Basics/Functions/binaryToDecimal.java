package JAVA_Basics.Functions;

import java.util.*;

public class binaryToDecimal {

    public static void binToDec(int binNum) {
        int binaryNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal no. of " + binaryNum + " is = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        binToDec(num);
        sc.close();
    }

}
