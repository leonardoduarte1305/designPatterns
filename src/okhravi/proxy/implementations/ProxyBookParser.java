package okhravi.proxy.implementations;

import okhravi.proxy.interfaces.BookParser;

public class ProxyBookParser implements BookParser {
    private BookParser bookParser = null;
    private String wholeBookToParse;

    public ProxyBookParser(String wholeBookToParse) {
        this.wholeBookToParse = wholeBookToParse;
    }

    @Override
    public int getNumberOfPages() {
        instantiateRealBookParser();
        return this.bookParser.getNumberOfPages();
    }

    @Override
    public int getNumberOfChapters() {
        instantiateRealBookParser();
        return this.bookParser.getNumberOfChapters();
    }

    @Override
    public int getNumberOfWords() {
        instantiateRealBookParser();
        return this.bookParser.getNumberOfWords();
    }

    private void instantiateRealBookParser() {
        if (this.bookParser == null) {
            this.bookParser = new RealBookParser(wholeBookToParse);
        }
    }

    public void setWholeBookToParse(String wholeBookToParse) {
        this.wholeBookToParse = wholeBookToParse;
    }

    public String getWholeBookToParse() {
        return wholeBookToParse;
    }
}
