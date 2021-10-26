package tierramedia;

public class Promocion3x2 extends Promocion{
	private double gratis;

	public Promocion3x2(String nombre, Atraccion a1, Atraccion a2, Atraccion a3) {
		super(nombre, a1, a2, a3);
		this.gratis = a3.getCosto();
	}
	public Promocion3x2(String nombre, Atraccion a1, Atraccion a2, Atraccion a3, Atraccion a4) {
		super(nombre, a1, a2, a3,a4);
		this.gratis = a3.getCosto() + a4.getCosto();
	}
	
	@Override
	public double getCosto() {
		this.setCosto();
		return costo - this.gratis;
	}

	public void setCosto() {
		this.costo = 0;
		for (Atraccion promo : promocion) {
			this.costo += promo.getCosto();
		}
	}
	

}
