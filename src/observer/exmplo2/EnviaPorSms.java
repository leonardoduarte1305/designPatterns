package observer.exmplo2;

import builder.AcaoAposGerarNota;
import builder.NotaFiscal;

public class EnviaPorSms implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por sms");
	}
}
