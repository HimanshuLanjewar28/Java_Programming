package JAVA_Basics.Functions;

public class functionOverloading {
    
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(5,6,4));
        System.out.println(sum(3.4f,6.6f));
    }
}

