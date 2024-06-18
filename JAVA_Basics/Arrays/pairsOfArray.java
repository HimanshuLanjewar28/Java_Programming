package JAVA_Basics.Arrays;

public class pairsOfArray {
    public static void arrayPairs(int num[]){
        for(int i=0;i<num.length;i++){
            int present = num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + present + "," + num[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        System.out.println("The pairs are given below: ");
        arrayPairs(num);
    }
}
