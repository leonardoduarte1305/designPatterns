package state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Você não pode aprovar um orçamento já reprovado");

	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Você não pode reprovar um orçamento já reprovado");

	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}

}
