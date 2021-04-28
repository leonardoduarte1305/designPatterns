package memento;

import java.util.Calendar;

public class Contrato {

	private Calendar data;
	private String cliente;
	private TipoContrato tipo;

	public Contrato(Calendar data, String cliente, TipoContrato tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}

	public void avanca() {
		if (tipo == TipoContrato.NOVO)
			tipo = TipoContrato.EM_ANDAMENTO;
		else if (tipo == TipoContrato.EM_ANDAMENTO)
			tipo = TipoContrato.ACERTADO;
		else if (tipo == TipoContrato.ACERTADO)
			tipo = TipoContrato.CONLUIDO;
	}

	public Estado salva() {
		return new Estado(new Contrato(this.data, this.cliente, this.tipo));
	}
}
