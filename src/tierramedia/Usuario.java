package tierramedia;

import java.util.ArrayList;

public class Usuario {
	private double presupuesto;
	private double tiempoDisponible;
	protected ArrayList<Atraccion> atraccionAceptada = new ArrayList<>();
	protected ArrayList<Promocion> promocionAceptada = new ArrayList<>();

	public Usuario(double presupuesto, double tiempoDisponible) {
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
	}

	public double getPresupuesto() {
		return this.presupuesto;
	}

	public double getTiempoDisponible() {
		return this.tiempoDisponible;
	}

	public boolean sugerenciaPromocion(Promocion sugerencia) {
		boolean band =true;
		boolean band1 =true;
		if (this.presupuesto >= sugerencia.getCosto() && this.tiempoDisponible >= sugerencia.getDuracion()
				&& sugerencia.getCupo()) {
			band=true;
			for (Atraccion atraccion : atraccionAceptada) {
				if (sugerencia.compararAtracciones(atraccion)) {
					band1 = false;
				}

			}
		}else band=false;
		
		if(band == true && band1 == true) {
			return true;
		}
		else return false;
	}

	/*
	 * if (this.presupuesto >= sugerencia.getCosto() && this.tiempoDisponible >=
	 * sugerencia.getDuracion() && sugerencia.getCupo()) { for (Atraccion promo :
	 * sugerencia.consultarPromociones()) { for (Atraccion atraccion :
	 * atraccionAceptada) { if (!promo.equals(atraccion)) { return true; } } } }
	 * return false; }
	 */

	public void aceptarPromociones(Promocion sugerencia) {
		sugerencia.restarCupo();
		this.tiempoDisponible -= sugerencia.getDuracion();
		System.out.println("duracion Hs: " + sugerencia.getDuracion());
		System.out.println("Tiempo disponible: " + this.tiempoDisponible);
		this.presupuesto -= sugerencia.getCosto();
		System.out.println("costo de promocion " + sugerencia.getCosto());
		System.out.println(" Saldo disponible: $ " + this.presupuesto);
		this.promocionAceptada.add(sugerencia);
		for (Atraccion promo : sugerencia.promocion) {
			atraccionAceptada.add(promo);
		}
		// GUARDAR TODAS LAS ATRACCIONES DE LA PROMOCION
	}

	public boolean sugerenciaAtraccion(Atraccion sugerencia) {

		if (this.presupuesto >= sugerencia.getCosto() && this.tiempoDisponible >= sugerencia.getDuracion()
				&& sugerencia.getCupo() > 0 && !this.atraccionAceptada.contains(sugerencia)) {
			return true;
		} else
			return false;
	}

	public void agregarAtraccion(Atraccion sugerencia) {
		this.tiempoDisponible -= sugerencia.getTiempo();
		System.out.println("duracion Hs: " + sugerencia.getTiempo());
		System.out.println("Tiempo disponible: " + this.tiempoDisponible);
		this.presupuesto -= sugerencia.getCosto();
		System.out.println("costo de promocion " + sugerencia.getCosto());
		System.out.println(" Saldo disponible: $ " + this.presupuesto);
		this.atraccionAceptada.add(sugerencia);
	}

	public ArrayList<Promocion> consultarPromociones() {

		return promocionAceptada;
	}

	public ArrayList<Atraccion> consultarAtraccions() {

		return atraccionAceptada;
	}

}
