import java.util.*;
public class ejercicio11 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double cen,yar,me,ft,in;
    
    System.out.print("ingrese el numero en centimetros que desea convertir: " );
    cen  = scanner.nextDouble();

    yar = cen*0.0109361;
    me = cen*0.01;
    ft = cen*0.0328084;
    in = cen*0.393701;
    System.out.println("en yarda es: "+yar );
    System.out.println("en metros es: " +me);
    System.out.println("en pies es: "  +ft);
    System.out.println("en pulgadas es: " +in );
    
   
    }
    
    }