package tierramedia;

public class PromocionPorcentual extends Promocion {
	public PromocionPorcentual(String nombre, Atraccion a1, Atraccion a2, Atraccion a3, double descuento) {
		super(nombre, a1, a2, a3, descuento);
	}
	public PromocionPorcentual(String nombre, Atraccion a1, Atraccion a2, double descuento) {
		super(nombre, a1, a2, descuento);
	}
	
	@Override
	public double getCosto() {
		double costo = super.getCosto();
		return costo - (costo * this.descuento);
	}


}
