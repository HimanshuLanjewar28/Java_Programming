package JAVA_Basics.Arrays;
import java.util.*;

public class largest {
    
    public static int largestNumber(int num[]){
        int largestNum = Integer.MIN_VALUE;   //(-infinity) 
        int smallestNum = Integer.MAX_VALUE; //(+infinity)

        for(int i=0;i<num.length;i++){
            if(largestNum < num[i]){
                largestNum = num[i];
            }
            if (smallestNum > num[i]) {
                smallestNum = num[i];
            }
        }
        System.out.println("Smallest number from the Array is: "+smallestNum);
        return largestNum;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int num[] = {1,5,3,9,4};
        int LargestNum =  largestNumber(num);
        System.out.println("Largest number from the Array is: " + LargestNum);
        ip.close();
    }
}
