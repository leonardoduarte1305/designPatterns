package state;

public class EmAprovacao implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			this.descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já foi aplicado.");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();

	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Você não pode finalizar um pedido que nao foi nem aprovado nem reprovado.");

	}
}
