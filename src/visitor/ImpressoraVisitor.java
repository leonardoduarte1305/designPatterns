package visitor;

public class ImpressoraVisitor implements Visitor {

	public void visitaSoma(Soma soma) {

		System.out.print("(");

		// Express�o da Esquerda
		soma.getEsquerda().aceita(this);

		System.out.print("+");

		// Express�o da Direita
		soma.getDireita().aceita(this);

		System.out.print(")");
	}

	public void visitaSubtracao(Subtracao subtracao) {

		System.out.print("(");

		// Express�o da Esquerda
		subtracao.getEsquerda().aceita(this);

		System.out.print("-");

		// Express�o da Direita
		subtracao.getDireita().aceita(this);

		System.out.print(")");
	}

	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}
}
