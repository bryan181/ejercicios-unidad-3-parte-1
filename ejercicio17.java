import java.util.*;
public class ejercicio17 {
    public static void main(String[] args) {

		double a, b, c;

		Scanner scanner=new Scanner(System.in);
		System.out.println("*** Ingrese los 3 lados de un tráangulo para determinar su tipo (Equilátero, Isásceles o Escaleno ***");
		System.out.print("Ingrese el primer lado: ");
		a=scanner.nextDouble();
		System.out.print("Ingrese el segundo lado: ");
		b=scanner.nextDouble();
		System.out.print("Ingrese el tercer lado: ");
		c=scanner.nextDouble();

		if (a==b) {
			if (a==c) {
				System.out.println("El triángulo es Equilátero.");
			} 
			else {
				System.out.println("El triángulo es Isósceles.");
			}
		} 
		else {
			if (b==c) {
				System.out.println("El triángulo es Isósceles.");
			} 
			else {
				System.out.println("El triángulo es Escaleno.");
			}
		}
	}
}
