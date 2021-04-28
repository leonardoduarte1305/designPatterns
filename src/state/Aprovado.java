package state;

public class Aprovado implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			this.descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já foi aplicado.");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Você não pode aprovar um orçamento já aprovado.");

	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Você não pode aprovar um orçamento já reprovado.");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}
}
