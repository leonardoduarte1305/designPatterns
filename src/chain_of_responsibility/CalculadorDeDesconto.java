package chain_of_responsibility;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {

		Desconto d1 = new DescontoPor5Itens();
		Desconto d2 = new DescontoParaMaisDe500Reais();
		Desconto d3 = new DescotoNulo();
		
		d1.proximoDescontoIS(d2);
		d2.proximoDescontoIS(d3);
		return 0;
	}
}
