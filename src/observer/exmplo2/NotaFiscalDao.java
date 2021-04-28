package observer.exmplo2;

import builder.AcaoAposGerarNota;
import builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Salvei no banco");
	}
}
