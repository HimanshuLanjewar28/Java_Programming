package JAVA_Basics.Arrays;
import java.util.*;
import java.util.Scanner;

public class linearSearch {
    
    public static int linearsearch(int num[], int key){

        for(int i=0;i<num.length;i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num[] = {2,4,6,8,10,12,14,16};
        int key = ip.nextInt();

        int index = linearsearch(num, key);

        if(index == -1){
            System.out.println("Not found");
        }
        else{
        System.out.println("Index of " + key +" is: " +index);

        }
        ip.close();
    }
}
