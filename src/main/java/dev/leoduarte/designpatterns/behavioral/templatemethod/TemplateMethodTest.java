package dev.leoduarte.designpatterns.behavioral.templatemethod;

import dev.leoduarte.designpatterns.behavioral.templatemethod.implementations.JSONProcessor;
import dev.leoduarte.designpatterns.behavioral.templatemethod.implementations.XMLProcessor;
import dev.leoduarte.designpatterns.behavioral.templatemethod.abstractions.DataProcessor;

import java.io.IOException;

public class TemplateMethodTest {
    public static void main(String[] args) throws IOException {
        DataProcessor jsonProcessor = new JSONProcessor();
        jsonProcessor.processData();

        DataProcessor xmlProcessor = new XMLProcessor();
        xmlProcessor.processData();
    }
}
