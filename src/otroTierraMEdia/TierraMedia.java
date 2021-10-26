package otroTierraMEdia;

import java.util.ArrayList;
import java.util.Collections;

import tierramedia.Atraccion;


public class TierraMedia {

	private ArrayList<Atraccion> atracciones;

	public TierraMedia() {
		atracciones = new ArrayList<>();
	}

	public boolean agregarListaAtracciones(String rutaArchivo) {
		return atracciones.addAll(LectordeAtracciones.devolverListaAtracciones(rutaArchivo));
	}

	public boolean addAtraccion(Atraccion nuevo) {
		return this.atracciones.add(nuevo);
	}
	
	public Atraccion irPosicion(int posicion) {
		return this.atracciones.get(posicion);
	}
	

	@SuppressWarnings("unchecked")
	public ArrayList<Atraccion> getAtraccionesOrdenadoPorCosto() {
		ArrayList<Atraccion> copia = (ArrayList<Atraccion>) ((ArrayList<Atraccion>) atracciones).clone();
		Collections.sort(copia, new OrdenadoPorCosto());
		return copia;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Atraccion> getAtraccionesOrdenadoPorTiempo() {
		ArrayList<Atraccion> copia = (ArrayList<Atraccion>) ((ArrayList<Atraccion>) atracciones).clone();
		Collections.sort(copia, new OrdenadoPorTiempo());
		return copia;
	}

	public void listarAtracciones() {
		System.out.println("Atracciones:");
		// atracciones.forEach(atraccion-> System.out.println(String.format("\t %s",
		// atraccion.toString())));
		atracciones.forEach(atraccion -> System.out.println(atraccion.getID()+String.format("\t %s",
				atraccion.getNombre() + "  $" + atraccion.getCosto() + "   " + atraccion.getTiempo() + "hrs"  )));

	}


	

	/*
	 * int sumaCosto = 0; int sumaTiempo = 0; int contador;
	 * 
	 * Map<Atraccion, Integer> promoPorcentual = new HashMap<Atraccion, Integer>();
	 * atracciones.sort(new OrdenadoPorCosto());
	 * 
	 * Iterator<Atraccion> iterador = atracciones.iterator(); Atraccion actual =
	 * iterador.hasNext() ? iterador.next() : null;
	 * 
	 * while (iterador.hasNext()) { if (actual.getCupo() >= 1) { contador =0;
	 * sumaCosto += actual.getCosto(); while (sumaCosto <= usuario[0] ) {
	 * promoPorcentual.put(actual, contador); contador++; } }
	 * 
	 * } return promoPorcentual;
	 */
	}



		

		/*
		 * TierraMedia tierramedia= new TierraMedia();
		 * 
		 * Atraccion theStand = new Atraccion("BuenosAires",50,20,80); Atraccion
		 * elJoyero = new Atraccion("El Silmarillion", 90,89,21); Atraccion guerraPaz =
		 * new Atraccion("La Guerra y La Paz", 19,16,3);
		 * 
		 * tierramedia.addAtraccion(theStand); tierramedia.addAtraccion(elJoyero);
		 * tierramedia.addAtraccion(guerraPaz);
		 * 
		 * 
		 * tierramedia.agregarListaAtracciones("atracciones.csv");
		 * tierramedia.listarAtracciones();
		 * System.out.println(tierramedia.getAtraccionesOrdenadoPorCosto());
		 * System.out.println(tierramedia.getAtraccionesOrdenadoPorTiempo());
		 */



