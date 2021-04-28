package state;

public class NovoImpostoVF implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50.0;
	}

}
