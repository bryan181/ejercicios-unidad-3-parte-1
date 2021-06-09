import java.util.*;
public class ejercicio14 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n1,n2;
    
    System.out.print("ingrese el primer numero: " );
    n1  = scanner.nextInt();
        
    System.out.print("ingrese el segundo numero: " );
    n2 = scanner.nextInt();

    if (n1 % n2 == 0 ) {
       
        System.out.println("es divisible");
        

    }else{

        System.out.println("no es divisible");


    }

    }
    
    }