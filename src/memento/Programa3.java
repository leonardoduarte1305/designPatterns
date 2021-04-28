package memento;

import java.util.Calendar;

public class Programa3 {

	public static void main(String[] args) {

		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "Leonardo", TipoContrato.NOVO);
		historico.adiciona(c1.salva());

		c1.avanca();
		historico.adiciona(c1.salva());

		c1.avanca();
		historico.adiciona(c1.salva());

		Estado estadoAnterior = historico.pega(0);
		System.out.println(estadoAnterior.getEstado().getTipo());
	}
}
