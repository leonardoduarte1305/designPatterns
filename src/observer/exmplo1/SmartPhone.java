package observer.exmplo1;

public class SmartPhone implements IObserver {

	private WhatsAppChat chatToObserve;

	public SmartPhone(WhatsAppChat chatToObserve) {
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
