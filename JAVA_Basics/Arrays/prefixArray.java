package JAVA_Basics.Arrays;

public class prefixArray {
    
    public static void prefixArr(int num[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i; j<num.length;j++){
                int end = j;

                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < sum){
                    maxSum = sum;
                }
            }

        }
        System.out.println("Max sum is: "+maxSum);
    }

    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        prefixArr(num);
    }
}
