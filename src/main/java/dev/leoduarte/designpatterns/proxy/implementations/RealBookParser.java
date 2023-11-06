package dev.leoduarte.designpatterns.proxy.implementations;

import dev.leoduarte.designpatterns.proxy.interfaces.BookParser;

public class RealBookParser implements BookParser {
    private String wholeBookToParse;

    public RealBookParser(String wholeBookToParse) {
        this.wholeBookToParse = wholeBookToParse;

        System.err.println(
                "This instantiation is very difficult, since the wholeBookToParse is very large and " +
                        "heavy to process.");
    }

    @Override
    public int getNumberOfPages() {
        return getRandom();
    }

    @Override
    public int getNumberOfChapters() {
        return getRandom();
    }

    @Override
    public int getNumberOfWords() {
        return getRandom();
    }

    private static int getRandom() {
        return (int) Math.round(Math.random() * 100);
    }

    public void setWholeBookToParse(String wholeBookToParse) {
        this.wholeBookToParse = wholeBookToParse;
    }

    public String getWholeBookToParse() {
        return wholeBookToParse;
    }
}
