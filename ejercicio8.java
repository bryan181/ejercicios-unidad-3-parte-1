import java.util.*;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Div;
public class ejercicio8 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num1,num2,num3;
    double promedio;
    
    System.out.print("ingrese el numero: ");
    num1  = scanner.nextInt();
    System.out.print("ingrese el numero: ");
    num2  = scanner.nextInt();
    System.out.print("ingrese el numero: ");
    num3  = scanner.nextInt();
    
    promedio = (num1+num2+num3)* 1 / 3;
    System.out.println("el promedio es:  "+promedio);

    }
    
    }
