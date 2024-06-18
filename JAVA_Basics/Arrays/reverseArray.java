package JAVA_Basics.Arrays;
import java.util.*;

public class reverseArray {
    public static void reverseArr(int num[]){
        int start = 0; int end = num.length-1;
        
        int temp = num[end];
        num[end] = num[start];
        num[start] = temp;

        start++;
        end--;
        }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num[] = {2,3,5,4,8,9};
        reverseArr(num);
        
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        ip.close();
    }
}
