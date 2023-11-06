package okhravi.bridge.abstractions;

import okhravi.bridge.interfaces.Resource;

public abstract class View {

    protected final Resource resource;

    public View(Resource resource) {
        this.resource = resource;
    }

    public abstract void show();

    public abstract String getHtmlString();
}
