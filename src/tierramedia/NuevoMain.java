package tierramedia;

import java.util.ArrayList;
import java.util.Scanner;

public class NuevoMain {
	public static void main(String[] args) {
		String respuesta;
		ArrayList<Atraccion> atraccionesDisponibles = new ArrayList<>();
		ArrayList<Promocion> promocionesDisponibles = new ArrayList<>();

		Atraccion moria = new Atraccion(1, "Moria", 10, 2, 6);
		Atraccion minasTirith = new Atraccion(2, "Minas Tirith", 5, 2.5, 25);
		Atraccion comarca = new Atraccion(3, "La Comarca", 3, 6.5, 150);
		Atraccion mordor = new Atraccion(4, "Mordor", 25, 3.0, 4);
		Atraccion abismoDeHelm = new Atraccion(5, "Abismo de Helm", 5, 2.0, 15);
		Atraccion lothlorien = new Atraccion(6, "Lothlorien", 35, 1, 30);
		Atraccion erebor = new Atraccion(7, "Erebor", 12, 3.0, 32);
		Atraccion bosqueNegro = new Atraccion(8, "Bosque Negro", 3, 4.0, 12);
		atraccionesDisponibles.add(moria);
		atraccionesDisponibles.add(mordor);
		atraccionesDisponibles.add(bosqueNegro);
		atraccionesDisponibles.add(minasTirith);
		atraccionesDisponibles.add(erebor);
		atraccionesDisponibles.add(abismoDeHelm);
		atraccionesDisponibles.add(comarca);
		atraccionesDisponibles.add(lothlorien);

		PromocionPorcentual PackAventura = new PromocionPorcentual("PackAventura", bosqueNegro, mordor, 0.20);
		PromocionPorcentual PackAventuraPlus = new PromocionPorcentual("PackAventuraPlus", bosqueNegro, mordor, lothlorien, 0.10);
		Promocion3x2 PackAventura3x2 = new Promocion3x2("PackAventura3x2",minasTirith, abismoDeHelm, erebor);
		Promocion3x2 PackAventuraExtrema = new Promocion3x2("PackAventuraExtrema",minasTirith, lothlorien, erebor, bosqueNegro);
		PromocionAbsoluta PackDegustacionGold = new PromocionAbsoluta("PackDegustacionGold",lothlorien, erebor, comarca, 46);
		PromocionAbsoluta PackDegustacion = new PromocionAbsoluta("PackDegustacion",lothlorien, comarca, 36);
		promocionesDisponibles.add(PackAventuraPlus);
		promocionesDisponibles.add(PackAventuraExtrema);
		promocionesDisponibles.add(PackAventura);
		promocionesDisponibles.add(PackAventura3x2);
		promocionesDisponibles.add(PackDegustacionGold);
		promocionesDisponibles.add(PackDegustacion);

		// cargar usuario
		Usuario usuario = new Usuario( 300, 200);
		// sugerencia de promociones
		for(Promocion promo: promocionesDisponibles) {
			
			if(usuario.sugerenciaPromocion(promo)) {
				System.out.println(" desea acepatr la promocion "+ promo.toString() + " costo de $" + promo.getCosto() + " duracion de hs " + promo.getDuracion());// habia una manera de que hacer el toString
				System.out.println("ingrese si o no");
				//entrada por teclado Si o No;
				//aceptarPromocion
				@SuppressWarnings("resource")
				Scanner entradaEscaner = new Scanner(System.in); // Creación de un objeto Scanner

				respuesta = entradaEscaner.nextLine();
				if((respuesta.equals("si"))) {//NO ME ESTA COMPARANDO PARA ACEPTAR LA PROMOCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
					usuario.aceptarPromociones(promo);
				}
			}
		}
		// sugerencia de atraccion
		for(Atraccion atraccion: atraccionesDisponibles) {
			if(usuario.sugerenciaAtraccion(atraccion)) {
				System.out.println("desea acepatr la "+ atraccion.toString());
				System.out.println("ingrese si o no");
				//entrada por teclado Si o No;
				//aceptarPromocion
				@SuppressWarnings("resource")
				Scanner entradaEscaner = new Scanner(System.in); // Creación de un objeto Scanner

				respuesta = entradaEscaner.nextLine();
				if(respuesta.equals("si")) {
					usuario.agregarAtraccion(atraccion);
				}
			}
		}
		System.out.println("las promociones aceptadas son: ");
	System.out.println(usuario.promocionAceptada);
	System.out.println("las atracciones aceptadas son: ");
	System.out.println(usuario.atraccionAceptada);
	
	
	}
	

}
