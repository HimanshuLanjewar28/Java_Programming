package JAVA_Basics.Arrays;

public class subArrayMaxSum {
    
    public static void maxSum(int num[]) {
    
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            int start = i;

            for(int j=i;j<num.length;j++){
                int end = j;
                sum = 0;

                for(int k=start;k<=end;k++){
                    sum += num[k];
                }
                System.out.println(sum);
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sum is: "+maxSum);
    }

    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        maxSum(num);
    }
}
