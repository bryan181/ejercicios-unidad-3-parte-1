import java.util.*;
public class ejercicio12 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    float f,c;
    
    System.out.print("ingrese la temoeratura en fharenheit a convertir: " );
    f  = scanner.nextFloat();
   
    c = (f-32)*5/9;


    System.out.println("los celsius son: "+c);
   
   
    }
    
    }