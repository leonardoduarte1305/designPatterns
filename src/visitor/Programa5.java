package visitor;

public class Programa5 {

	public static void main(String[] args) {

		Expressao esquerda = new Soma(new Subtracao(new Numero(10), new Numero(2)), new Numero(5));
		Expressao direita = new Subtracao(new Subtracao(new Numero(20), new Numero(15)), new Numero(5));
		Expressao soma = new Soma(esquerda, direita);

		int resultado = soma.avalia();

		ImpressoraVisitor2 impressora = new ImpressoraVisitor2();
		soma.aceita(impressora);
	}
}
