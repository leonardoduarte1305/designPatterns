package state;

import java.util.ArrayList;
import java.util.List;

import chain_of_responsibility.Item;

public class Orcamento {

	protected double valor;
	private final List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
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

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprovar(this);
	}

	public void finaliza() {
		estadoAtual.finalizar(this);
	}
}
