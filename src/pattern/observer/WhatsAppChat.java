package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WhatsAppChat implements IObservable {

	// Examples of things to observe
	private List<String> messages = new ArrayList<>();
	private int position = 0;

	// Here is the list of observers to push data
	private List<IObserver> observers = new ArrayList<>();

	@Override
	public void addObserver(IObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(o -> o.update());
	}

	public void addMessage(String newMessage) {
		this.messages.add(newMessage);
		this.position += 1;
	}

	public List<String> getMessages() {
		return messages;
	}

	public int getPosition() {
		return position;
	}

}
