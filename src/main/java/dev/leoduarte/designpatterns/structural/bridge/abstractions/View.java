package dev.leoduarte.designpatterns.structural.bridge.abstractions;

import dev.leoduarte.designpatterns.structural.bridge.interfaces.Resource;

public abstract class View {

    protected final Resource resource;

    public View(Resource resource) {
        this.resource = resource;
    }

    public abstract void show();

    public abstract String getHtmlString();
}
