package tierramedia;

import java.util.ArrayList;
public class Promocion {
	protected double costo;
	protected String nombre;
	protected double duracion;
	protected double descuento;
	protected boolean cupo;
	protected ArrayList<Atraccion> promocion = new ArrayList<>();

	public Promocion(String nombre, Atraccion a1, Atraccion a2, Atraccion a3, double descuento) {
		this.nombre = nombre;
		this.promocion.add(a1);
		this.promocion.add(a2);
		this.promocion.add(a3);
		this.descuento = descuento;
	}

	public Promocion(String nombre, Atraccion a1, Atraccion a2, double descuento) {
		this.promocion.add(a1);
		this.promocion.add(a2);
		this.descuento = descuento;
		this.nombre = nombre;
	}

	public Promocion(String nombre, Atraccion a1, Atraccion a2, Atraccion a3) {
		this.promocion.add(a1);
		this.promocion.add(a2);
		this.promocion.add(a3);
		this.nombre = nombre;
	}

	public Promocion(String nombre, Atraccion a1, Atraccion a2, Atraccion a3, Atraccion a4) {
		this.promocion.add(a1);
		this.promocion.add(a2);
		this.promocion.add(a3);
		this.promocion.add(a4);
		this.nombre = nombre;
	}


	/*
	 * /blic String getNombre() { return nombre; }
	 */

	public double getCosto() {
		double costo = 0;
		for (Atraccion promo : promocion) {
			costo += promo.getCosto();
		}
		return costo;
	}

	public void setDuracion() {
		this.duracion = 0;
		for (Atraccion promo : promocion) {
			this.duracion += promo.getTiempo();
		}
	}

	public double getDuracion() {
		this.setDuracion();
		return duracion;
	}

	public boolean getCupo() {
		boolean cupo = true;
		for (Atraccion promo : promocion) {
			if (promo.getCupo() <= 0) {
				this.cupo = false;
			}
			return cupo;
		}
		return cupo;
	}

	public void restarCupo() {
		for (Atraccion promo : promocion) {
			promo.restarCupo();
		}
	}

	public String toString() {
		return nombre;
	}

	public ArrayList<Atraccion> consultarPromociones() {

		return promocion;
	}

	public boolean compararAtracciones(Atraccion otraAtraccion) {
		if (promocion.contains(otraAtraccion)) {
			return true;
		}
		return false;
	}

}