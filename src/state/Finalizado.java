package state;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Você não pode aprovar um orçamento já finalizado");

	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Você não pode reprovar um orçamento já finalizado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Você não pode finalizar um orçamento já finalizado");
	}

}
