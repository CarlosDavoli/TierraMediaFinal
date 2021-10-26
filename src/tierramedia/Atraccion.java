package tierramedia;

import java.util.Objects;

public class Atraccion {

	protected String nombre;
	protected int costo;
	protected double tiempo;
	protected int cupo;
	protected int ID;

	public Atraccion(int ID,String nombre, int costo, double tiempo, int cupo) {
		this.ID=ID;
		this.nombre = nombre;
		this.costo = costo;
		this.tiempo = tiempo;
		this.cupo = cupo;
	}
	
	public int getID() {
		return this.ID;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getCosto() {
		return this.costo;
	}

	public double getTiempo() {
		return this.tiempo;
	}

	public int getCupo() {
		return this.cupo;
	}

	public int restarCupo() {
		return this.cupo--;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(costo, cupo, nombre, tiempo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atraccion other = (Atraccion) obj;
		return costo == other.costo && cupo == other.cupo && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(tiempo) == Double.doubleToLongBits(other.tiempo);
	}

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", costo=" + costo + ", tiempo=" + tiempo + ", cupo=" + cupo + "]";
	}

	public double getDuracion() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
