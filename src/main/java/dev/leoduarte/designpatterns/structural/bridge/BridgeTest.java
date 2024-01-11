package dev.leoduarte.designpatterns.structural.bridge;

import dev.leoduarte.designpatterns.structural.bridge.abstractions.View;
import dev.leoduarte.designpatterns.structural.bridge.implementations.AlbumResource;
import dev.leoduarte.designpatterns.structural.bridge.implementations.BookResource;
import dev.leoduarte.designpatterns.structural.bridge.implementations.LongView;
import dev.leoduarte.designpatterns.structural.bridge.implementations.ShortView;
import dev.leoduarte.designpatterns.structural.bridge.interfaces.Resource;

public class BridgeTest {

    // Youtube Video
    // https://youtu.be/F1YQ7YRjttI?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc

    public static void main(String[] args) {

        // We pass the resource that we want to print to the desired View and then call the show() method
        Resource albumResource = new AlbumResource();
        View longView1 = new LongView(albumResource);
        longView1.show();

        // If we want to print other Resource but in the same View we can. Like this:
        Resource bookResource = new BookResource();
        View longView2 = new LongView(bookResource);
        longView2.show();

        // But if we want to print the ShortView of one of the previous Resources, we can do like this:
        View shortView1 = new ShortView(albumResource);
        shortView1.show();

        // And about the other resource:
        View shortView2 = new ShortView(bookResource);
        shortView2.show();

        System.out.println();
        System.err.print(shortView2.getHtmlString());
    }
}
