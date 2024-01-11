package dev.leoduarte.designpatterns.structural.proxy;

import dev.leoduarte.designpatterns.structural.proxy.implementations.ProxyBookParser;
import dev.leoduarte.designpatterns.structural.proxy.interfaces.BookParser;

public class ProxyTest {

    // Youtube Video
    // https://youtu.be/NwaabHqPHeM?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc

    public static void main(String[] args) {
        String wholeBookToParse = "A very expensive operation that will be delegated to RealBookParser only " +
                "the moment one of your domain's methods is called";
        BookParser bookParser = new ProxyBookParser(wholeBookToParse);

        // The RealBookParser will be instantiated in the next BookParser interface method call
        int numberOfChapters = bookParser.getNumberOfChapters();
        System.out.println("numberOfChapters = " + numberOfChapters);
    }
}
