package okhravi.bridge.implementations;

import okhravi.bridge.abstractions.View;
import okhravi.bridge.interfaces.Resource;

public class ShortView extends View {
    public ShortView(Resource resource) {
        super(resource);
    }

    @Override
    public void show() {
        System.out.println("======================================================");
        System.out.println("This is the Short printing version");
        System.out.printf("Name: %s\n", this.resource.getName());
    }

    @Override
    public String getHtmlString() {
        return String.format("This is the HTML for the ShortView: %s\n", this.resource.getName());
    }
}
