package state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Voc� n�o pode aprovar um or�amento j� reprovado");

	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Voc� n�o pode reprovar um or�amento j� reprovado");

	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}

}
