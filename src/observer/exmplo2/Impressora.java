package observer.exmplo2;

import builder.AcaoAposGerarNota;
import builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Imprimi a NF");
	}
}
