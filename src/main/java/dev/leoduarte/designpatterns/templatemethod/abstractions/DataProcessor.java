package dev.leoduarte.designpatterns.templatemethod.abstractions;

public abstract class DataProcessor {
    final public void processData() {
        System.out.println("This method is equal for each class which inherits this one," +
                " but the following methods are different");
        System.out.println("==========================================");
        openFile();
        readData();
        parseData();
        closeFile();
        printTheContentAsString();
        System.out.println("==========================================");
    }

    protected abstract void openFile();

    protected abstract void readData();

    protected abstract void parseData();

    protected abstract void closeFile();

    protected abstract void printTheContentAsString();

}
