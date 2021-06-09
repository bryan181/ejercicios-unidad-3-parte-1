import java.util.*;
public class ejercicio13 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double r,h,volumen;
    
    System.out.print("ingrese el radio: " );
    r  = scanner.nextDouble();
        
    System.out.print("ingrese la altura: " );
    h  = scanner.nextDouble();
    if (r>0 && h>0) {
        volumen = 3.1416*r*h;
        System.out.println("el volumen del cilidro es:"+volumen);
        

    }else{

        System.out.println("nose puede calcular porque no son numeros positivos");


    }

    }
    
    }