package visitor;

public interface Visitor {

	public void visitaSoma(Soma soma);

	public void visitaSubtracao(Subtracao subtracao);

	public void visitaNumero(Numero numero);
}
