package JAVA_Basics.Patterns;
import java.util.*;

public class diamond {
    public static void diamondPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int rows = ip.nextInt();
        diamondPattern(rows);
        ip.close();
    }
}
