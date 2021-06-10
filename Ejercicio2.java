import java.util.*;
public class Ejercicio2{
	public static void main(String[] args) {
		int valorN;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		valorN = scan.nextInt();
		valorN = valorN -1;
		do {
			System.out.println(valorN);
			valorN = valorN -1;
		} while (valorN != 0);
	}
}