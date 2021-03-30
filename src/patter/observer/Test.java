package patter.observer;

public class Test {
	public static void main(String[] args) {

		// Instance of Observable
		WhatsAppChat whatsAppScreen = new WhatsAppChat();

		// Instances of Observers of that Observable
		SmartPhone smartPhone = new SmartPhone(whatsAppScreen);
		WindowsPC windowsPc = new WindowsPC(whatsAppScreen);
		MacPC macPc = new MacPC(whatsAppScreen);

		whatsAppScreen.addObserver(smartPhone);
		whatsAppScreen.addObserver(windowsPc);
		whatsAppScreen.addObserver(macPc);

		whatsAppScreen.addMessage("Testing of this method.");

		whatsAppScreen.notifyObservers();
		
		System.out.println(smartPhone.getChatToObserve().getMessages());
		System.out.println(windowsPc.getChatToObserve().getMessages());
		System.out.println(macPc.getChatToObserve().getMessages());
	}
}
