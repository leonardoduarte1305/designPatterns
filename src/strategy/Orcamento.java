package strategy;

import java.util.ArrayList;
import java.util.List;

import chain_of_responsibility.Item;

public class Orcamento {

	private final double valor;
	private final List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}

//	Estava na classe CalculadoraDeImpostos
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorDeImposto = imposto.calculaImposto(orcamento);
		System.out.println(valorDeImposto);
	}

}
