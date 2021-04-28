package memento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historico {

	List<Estado> estadosSalvos = new ArrayList<Estado>();
	private List<LocalDateTime> horaDoSalvamento = new ArrayList<LocalDateTime>();

	public void adiciona(Estado estado) {
		estadosSalvos.add(estado);
		horaDoSalvamento.add(LocalDateTime.now());

	}

	public Estado pega(int index) {
		return estadosSalvos.get(index);
	}
}
