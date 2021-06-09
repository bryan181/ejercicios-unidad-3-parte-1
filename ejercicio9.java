import java.util.*;
public class ejercicio9 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String a,b,intercambio;
    
    System.out.print("a.escriba una palabra: ");
    a  = scanner.nextLine();
    System.out.print("b.escriba una palabra: ");
    b  = scanner.nextLine();

    intercambio = a;
    a = b;
    b=intercambio;

    System.out.print("la palabra de a en intercambio: "+a);
    System.out.print("  <- la palabra de b en intercambio -> ");
    System.out.print(b);
   
    }
    
    }
