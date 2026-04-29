package Java_Loops;
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num;
        do{
            System.out.println(" Enter a number (0 to Stop): ");
            num = sc.nextInt();      
        }while ( num != 0);

        System.out.println("Loop Exired");

        sc.close();

    }
    
}
