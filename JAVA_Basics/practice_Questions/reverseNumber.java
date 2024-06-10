package JAVA_Basics.practice_Questions;
import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that needs to be reverse: ");
        int num = sc.nextInt();

        while(num > 0){
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
        sc.close();
    }
}
