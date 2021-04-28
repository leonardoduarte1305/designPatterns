package state;

public class Aprovado implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			this.descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� foi aplicado.");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Voc� n�o pode aprovar um or�amento j� aprovado.");

	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Voc� n�o pode aprovar um or�amento j� reprovado.");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}
}
