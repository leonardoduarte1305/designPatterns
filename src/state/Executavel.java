package state;

public class Executavel {

	public static void main(String[] args) {
		ICMS icms = new ICMS();
		ISS iss = new ISS();
		ICCC iccc = new ICCC();
		NovoImpostoVF novoImposto = new NovoImpostoVF();

		Orcamento orcamento = new Orcamento(500);

//		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

//		calculadora.realizaCalculo(orcamento, icms);
//		calculadora.realizaCalculo(orcamento, iss);
//		calculadora.realizaCalculo(orcamento, novoImposto);
//		calculadora.realizaCalculo(orcamento, iccc);
		
		orcamento.realizaCalculo(orcamento, icms);
		orcamento.realizaCalculo(orcamento, iss);
		orcamento.realizaCalculo(orcamento, iccc);
		orcamento.realizaCalculo(orcamento, novoImposto);
	}
}
