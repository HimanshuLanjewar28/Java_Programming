package JAVA_Basics.Functions;
import java.util.*;

public class binomialCoefficient {
    
    public static int factorialOfNum(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }


    public static int binCoeff(int n, int r){
        int fact_n = factorialOfNum(n);
        int fact_r = factorialOfNum(r);
        int subOfTwoFact = factorialOfNum(n-r);

        int binCoeff = fact_n / (fact_r * subOfTwoFact);
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Enter the value of n: ");
        int r = sc.nextInt();

        System.out.println(binCoeff(n, r));
        sc.close();
    }

}
