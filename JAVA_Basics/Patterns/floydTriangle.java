package JAVA_Basics.Patterns;
import java.util.*;
public class floydTriangle {
    
    public static void floydTrianglePattern(int n){
        int count=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                System.out.print(" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        floydTrianglePattern(rows);
        sc.close();
    }
}
