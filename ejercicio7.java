import java.util.*;
public class ejercicio7 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double disminuido;
    String ok;
    int alea = (int)(Math.random() * 50+10); 
    disminuido = alea*0.75;

    System.out.println("di ok para darte un numero entre el 10 a 50: ");
    ok  = scanner.nextLine();
    System.out.print(alea);
    System.out.println("  el numero disminuido en un 15% es: " +disminuido);
   
    }
    
    }
