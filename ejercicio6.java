import java.util.*;
public class ejercicio6 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double aumento;
    String ok;
    int alea = (int)(Math.random() * 200+1); 
    aumento = alea*1.3;

    System.out.println("di ok para darte un numero del 0 a 200: ");
    ok  = scanner.nextLine();
    System.out.print(alea);
    System.out.println("  el numero aumentado en un 30% es: " +aumento);
   
    }
    
    }
