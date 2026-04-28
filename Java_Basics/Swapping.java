package Java_Basics;
import java.util.Scanner;

public class Swapping {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        int temp; // Temporary variable to temporary value during swapping

        temp = a;
        a= b;
        b= temp;

        System.out.println("After Swapping:");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        sc.close();

    }
    
}
