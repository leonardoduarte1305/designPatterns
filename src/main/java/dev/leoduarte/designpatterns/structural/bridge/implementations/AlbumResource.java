package dev.leoduarte.designpatterns.structural.bridge.implementations;

import dev.leoduarte.designpatterns.structural.bridge.interfaces.Resource;

import java.util.Arrays;

public class AlbumResource implements Resource {
    @Override
    public String getName() {
//        System.out.printf("I am the getName implementation in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getSimpleName();
    }

    @Override
    public char[] getImageAsCharArray() {
//        System.out.printf("I am the getImageAsCharArray implementation in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getCanonicalName().toCharArray();
    }

    @Override
    public String getSnippet() {
//        System.out.printf("I am the getSnippet implementation in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getPackageName();
    }

    @Override
    public String getUrl() {
//        System.out.printf("I am the getUrl implementation in the class: %s\n", this.getClass().getSimpleName());
        return Arrays.toString(this.getClass().getMethods());
    }
}
