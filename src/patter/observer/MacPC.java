package patter.observer;

public class MacPC implements IObserver {

	private WhatsAppChat chatToObserve;

	public MacPC(WhatsAppChat chatToObserve) {
		this.chatToObserve = chatToObserve;
	}

	@Override
	public void update() {
		this.chatToObserve.getMessages();
	}

	public WhatsAppChat getChatToObserve() {
		return chatToObserve;
	}
	
}
