package JAVA_Basics.Patterns;
import java.util.*;

public class invertedNumbers {
    
    public static void invertedPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(j);
            }
            for(int j=5;j>=(n-i);j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        invertedPattern(rows);
        sc.close();
    }
}
