package state;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);

	void reprovar(Orcamento orcamento);

	void finalizar(Orcamento orcamento);
}
