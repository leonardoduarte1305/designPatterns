package builder;

public class Multiplicador implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Valor bruto * 10: " + nf.getValorBruto() * 10);
	}

}
