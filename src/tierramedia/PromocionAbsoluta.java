package tierramedia;

public class PromocionAbsoluta extends Promocion {
	
	public PromocionAbsoluta(String nombre, Atraccion a1, Atraccion a2, Atraccion a3, float descuento) {
		super(nombre, a1, a2, a3, descuento);
	}
	public PromocionAbsoluta(String nombre, Atraccion a1, Atraccion a2, float descuento) {
		super(nombre, a1, a2, descuento);
	}
	
	@Override
	public double getCosto() {
		this.setCosto();
		return costo - this.descuento;
	}

	public void setCosto() {
		this.costo = 0;
		for (Atraccion promo : promocion) {
			this.costo += promo.getCosto();
		}
	}

}
