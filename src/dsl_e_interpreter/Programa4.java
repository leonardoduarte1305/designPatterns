package dsl_e_interpreter;

public class Programa4 {

	public static void main(String[] args) {
		Expressao e2 = new Soma(new Numero(10), new Multiplicacao(new Numero(15), new Numero(10)));
		int e2r = e2.avalia();
		System.out.println(e2r);

		Expressao m1 = new Multiplicacao(new Numero(15), new Numero(10));
		int m1r = m1.avalia();
		System.out.println(m1r);

		Expressao d2 = new Divisao(new Numero(100), new Multiplicacao(new Numero(5), new Numero(4)));
		int d2r = d2.avalia();
		System.out.println(d2r);
		
		Expressao r2 = new RaizQuadrada(new Multiplicacao(new Numero(100), new Numero(5)));
		int r2r = r2.avalia();
		System.out.println(r2r);
		
	}
}
