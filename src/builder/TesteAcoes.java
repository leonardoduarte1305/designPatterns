package builder;

import java.util.Arrays;

import observer.exmplo2.EnviaPorSms;
import observer.exmplo2.EnviadorDeEmail;
import observer.exmplo2.NotaFiscalDao;

public class TesteAcoes {

	public static void main(String[] args) {
		NotaFiscal notaF = new NotaFiscalBuilder(
				Arrays.asList(new EnviadorDeEmail(), new NotaFiscalDao(), new EnviaPorSms(), new Multiplicador()))
						.cnpj("123.123.123/0001-12").naDataAtual().comItem(new ItemDaNota("Item 1", 200.0))
						.comItem(new ItemDaNota("Item 2", 400.0)).constroi();

		System.out.println(notaF);
	}
}
