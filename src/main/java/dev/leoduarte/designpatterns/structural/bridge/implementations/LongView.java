package dev.leoduarte.designpatterns.structural.bridge.implementations;

import dev.leoduarte.designpatterns.structural.bridge.abstractions.View;
import dev.leoduarte.designpatterns.structural.bridge.interfaces.Resource;

import java.util.Arrays;

public class LongView extends View {
    public LongView(Resource resource) {
        super(resource);
    }

    @Override
    public void show() {
        System.out.println("======================================================");
        System.out.println("This is the LongView printing version");
        System.out.printf("This class: \"%s\", is printing it's version of the Resource: \"%s\"\n", this.getClass().getSimpleName(), this.resource.getClass().getSimpleName());
        System.out.printf("Name: %s\n", this.resource.getName());
        System.out.printf("Snippet: %s\n", this.resource.getSnippet());
        System.out.printf("Image: %s\n", Arrays.toString(this.resource.getImageAsCharArray()));
        System.out.printf("URL: %s\n", this.resource.getUrl());
    }

    @Override
    public String getHtmlString() {
        return String.format("""
                        This is the HTML version for the LongView: %s
                        Snippet: %s
                        Image: %s
                        URL: %s
                        """,
                this.resource.getName(),
                this.resource.getSnippet(),
                Arrays.toString(this.resource.getImageAsCharArray()),
                this.resource.getUrl());
    }
}
