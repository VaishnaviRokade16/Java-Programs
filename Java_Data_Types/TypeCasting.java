package Java_Data_Types;

public class TypeCasting {
    
    public static void main(String[] args){

        int a = 10;
        double b = a; // implicit casting 

        double x = 25.75;
        int y = (int) x;// Explicit casting

        System.out.println("Implicit Casting: ");
        System.out.println("int a= " + a);
        System.out.println("double b =" +b);

        System.out.println("Eplicit Casting:");
        System.out.println("doubl x = " + x);
        System.out.println("int y=" +y);


    }
} 
