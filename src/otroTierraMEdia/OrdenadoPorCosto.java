package otroTierraMEdia;

import java.util.Comparator;

import tierramedia.Atraccion;

public class OrdenadoPorCosto implements Comparator<Atraccion> {


	@Override
	public int compare(Atraccion atraccion1, Atraccion otraAtraccion) {
		return Integer.compare(atraccion1.getCosto(), otraAtraccion.getCosto())* -1;
	}

}
