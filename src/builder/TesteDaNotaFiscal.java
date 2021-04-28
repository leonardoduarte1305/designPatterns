package builder;

import java.util.Arrays;

import observer.exmplo2.EnviaPorSms;
import observer.exmplo2.EnviadorDeEmail;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {

//		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200.0), new ItemDaNota("Item 2", 400.0));
//		double valorTotal = 0;
//
//		for (ItemDaNota item : itens) {
//			valorTotal += item.getValor();
//		}
//
//		double impostos = valorTotal * 0.05;
//
//		NotaFiscal nf = new NotaFiscal("razao social", "cnpj", Calendar.getInstance(), valorTotal, impostos, itens,
//				"obs qualquer");

		NotaFiscal nf = new NotaFiscalBuilder(Arrays.asList(new EnviadorDeEmail(), new EnviaPorSms()))
				.paraEmpresa("Caelum Ensino").cnpj("123.123.123/0001-12").comItem(new ItemDaNota("Item 1", 200.0))
				.comItem(new ItemDaNota("Item 2", 400.0)).comObservacoes("Uma observação qualquer.").naDataAtual()
				.constroi();

	}
}
