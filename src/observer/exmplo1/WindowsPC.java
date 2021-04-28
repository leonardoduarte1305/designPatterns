package observer.exmplo1;

public class WindowsPC implements IObserver {

	private WhatsAppChat chatToObserve;

	public WindowsPC(WhatsAppChat chatToObserve) {
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
