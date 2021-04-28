package chain_of_responsibility;

public class DescotoNulo implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void proximoDescontoIS(Desconto proximo) {
	}

}
