package otroTierraMEdia;

import java.util.Scanner;

import tierramedia.Usuario;

public class Main {
	public static void main(String[] args) {
		final int tiempoDisp;
		final int dineroDisp;
		final String nombre;
		final int opcion;

		TierraMedia tierramedia = new TierraMedia();
		tierramedia.agregarListaAtracciones("atracciones.csv");
		
System.out.println(tierramedia.getAtraccionesOrdenadoPorCosto());
		System.out.println("Por favor Introduzca su nombre: ");

		String entradaTeclado ;

		Scanner entradaEscaner = new Scanner(System.in); // Creación de un objeto Scanner

		nombre = entradaEscaner.nextLine(); // Invocamos un método sobre un objeto Scanner

		System.out.println("Bienvenido a Tierra Media " + nombre);
		// usuario[0] = entradaTeclado;

		System.out.println("Quiere alguna promocion? S/N");

		entradaTeclado = entradaEscaner.nextLine();

		switch (entradaTeclado) {
		case "S":
			System.out.println("De cuanto dinero dispone: ");
			dineroDisp = (int) entradaEscaner.nextInt();
			System.out.println("De cuanto tiempo dispone: ");
			tiempoDisp = (int) entradaEscaner.nextDouble();
			Usuario nombre1 = new Usuario (dineroDisp, tiempoDisp); // ver como poner el nombre
			System.out.println("Promo porcentual con un 20 porciento de descuento: ");


		case "N":
			tierramedia.listarAtracciones();
			System.out.println("Elija la atraccion que desea realizar: ");
			opcion = entradaEscaner.nextInt();
			System.out.println("Usted eligio la opcion "+ opcion + "--->"+ tierramedia.irPosicion(opcion-1));
			
			break;
		default:
			System.out.println("ADIOS");
		}

}
}
