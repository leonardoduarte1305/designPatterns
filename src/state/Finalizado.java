package state;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Voc� n�o pode aprovar um or�amento j� finalizado");

	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Voc� n�o pode reprovar um or�amento j� finalizado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Voc� n�o pode finalizar um or�amento j� finalizado");
	}

}
