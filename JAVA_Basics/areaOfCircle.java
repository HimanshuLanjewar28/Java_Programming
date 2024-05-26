package JAVA_Basics;
import java.util.*;

public class areaOfCircle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the radius of the circle: ");
        float radius = sc.nextFloat();
        float area = (3.14f * radius * radius);
        System.out.println("The area of a circle is: " + area);
        sc.close();
    }
}
