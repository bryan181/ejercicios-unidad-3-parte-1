import java.util.*;
public class ejercicio10 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int b,h,a,p;
    
    System.out.print("ingrese la base: " );
    b  = scanner.nextInt();
    System.out.print("ingrese la altura: " );
    h  = scanner.nextInt();

    p = (2*b)+(2*h);
    a = b*h;
    System.out.println("el perimetro es: "+p);
    System.out.println("el area es: "+a);
   
   
    }
    
    }