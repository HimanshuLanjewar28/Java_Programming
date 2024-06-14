package JAVA_Basics.Patterns;
import java.util.*;
public class inverted {
    
    public static void invertedPattern(int rows){

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
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
