package dev.leoduarte.designpatterns.bridge.implementations;

import dev.leoduarte.designpatterns.bridge.interfaces.Resource;

import java.util.Arrays;

public class ProductResource implements Resource {
    @Override
    public String getName() {
//        System.out.printf("One more implementation of getName this time in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getSimpleName();
    }

    @Override
    public char[] getImageAsCharArray() {
//        System.out.printf("One more implementation of getImageAsCharArray this time in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getCanonicalName().toCharArray();
    }

    @Override
    public String getSnippet() {
//        System.out.printf("One more implementation of getSnippet this time in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getPackageName();
    }

    @Override
    public String getUrl() {
//        System.out.printf("One more implementation of getUrl this time in the class: %s\n", this.getClass().getSimpleName());
        return Arrays.toString(this.getClass().getMethods());
    }
}
