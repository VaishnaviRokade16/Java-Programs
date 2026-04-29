package Java_Loops;
import java.util.Scanner;


public class MenuCalculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n-- Calculator menu---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction"); 
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1 :
                    System.out.println("Enter two number: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result = " + (a+b) );
                    break;

                case 2 :
                    System.out.println("Enter two Number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Enter two number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    System.out.println("Enter two Number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result = " + (a / b));
                    break;

                case 0:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice");


            }

        }while(choice !=0);

        sc.close();

        
    }
     
}
