package JAVA_Basics.Arrays;
import java.util.*;

public class basicArray {

    public static void updateMarks(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String [] args){

        Scanner ip = new Scanner(System.in);

        // int marks[] = new int[5];
        
        // marks[0] = ip.nextInt();
        // marks[1] = ip.nextInt();
        // marks[2] = ip.nextInt();

        // System.out.println("phy: " + marks[0]);
        // System.out.println("chem: " + marks[1]);
        // System.out.println("maths: " + marks[2]);


        int marks[] = {1,2,3};
        updateMarks(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        ip.close();
    }
}
