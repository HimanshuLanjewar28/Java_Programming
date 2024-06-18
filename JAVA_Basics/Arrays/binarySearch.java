package JAVA_Basics.Arrays;
import java.util.*;
public class binarySearch {
    public static int bSearch(int num[], int key){

        int start = 0;
        int end = num.length - 1;

        while(start <= end){
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;
            }
            else if(num[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int num[] = {2,4,6,8,10,12,14,16,18,20};

        System.out.print("Enter the key: ");
        int key = ip.nextInt();

        int index = bSearch(num, key);

        if(index == -1){
            System.out.println("Index for "+ key + " is not found!!");
        }
        else{
        System.out.print("The index for "+ key + " is: "+index);
        }
        ip.close();
    }
}
