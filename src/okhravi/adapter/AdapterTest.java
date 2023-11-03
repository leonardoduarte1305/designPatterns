package okhravi.adapter;

import okhravi.adapter.implementations.Adaptee;
import okhravi.adapter.implementations.AdapterImplementation;
import okhravi.adapter.implementations.ClientClass;
import okhravi.adapter.implementations.OriginalImplementation;
import okhravi.adapter.interfaces.OriginalInterface;

public class AdapterTest {
    public static void main(String[] args) {
        // Declaring the Interface to use
        OriginalInterface originalInterface;

        // Injecting the OriginalImplementation to use the original method call
        originalInterface = new OriginalImplementation();
        ClientClass clientOriginal = new ClientClass(originalInterface);
        // Calling the original behavior
        clientOriginal.printClassName(clientOriginal.getClass().getSimpleName());

        // Injecting the AdapterImplementation to use the adapted method call
        originalInterface = new AdapterImplementation(new Adaptee());
        ClientClass clientClassAdapted = new ClientClass(originalInterface);

        // Calling the original behavior, but with the new behavior
        clientClassAdapted.printClassName(clientClassAdapted.getClass().getSimpleName());
    }
}
