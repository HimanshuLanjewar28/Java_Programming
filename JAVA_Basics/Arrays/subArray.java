package JAVA_Basics.Arrays;

public class subArray {

    public static void subArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int start = i;

            for (int j = i; j < num.length; j++) {
                int end = j;
                int subArraySum = 0; 

                for (int k = start; k <= end; k++) {
                    subArraySum += num[k];  
                    System.out.print(num[k] + " ");
                }
                System.out.println("---> The sum of given subArray is: " + subArraySum);  
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        subArr(num);
    }
}
