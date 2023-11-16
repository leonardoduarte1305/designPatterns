package dev.leoduarte.designpatterns.templatemethod;

import dev.leoduarte.designpatterns.templatemethod.implementations.JSONProcessor;
import dev.leoduarte.designpatterns.templatemethod.implementations.XMLProcessor;
import dev.leoduarte.designpatterns.templatemethod.abstractions.DataProcessor;

import java.io.IOException;

public class TemplateMethodTest {
    public static void main(String[] args) throws IOException {
        DataProcessor jsonProcessor = new JSONProcessor();
        jsonProcessor.processData();

        DataProcessor xmlProcessor = new XMLProcessor();
        xmlProcessor.processData();
    }
}
