package otroTierraMEdia;

import java.util.Comparator;

import tierramedia.Atraccion;

public class OrdenadoPorTiempo implements Comparator<Atraccion> {

	@Override
	public int compare(Atraccion atraccion1, Atraccion otraAtraccion) {
		return Double.compare(atraccion1.getTiempo(), otraAtraccion.getTiempo()) * -1;
	}

}
