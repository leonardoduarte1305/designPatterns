package observer.exmplo2;

import builder.AcaoAposGerarNota;
import builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Envia Email");
	}
}
