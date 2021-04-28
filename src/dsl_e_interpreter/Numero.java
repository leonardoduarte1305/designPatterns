package dsl_e_interpreter;

public class Numero implements Expressao {

	int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}
}
