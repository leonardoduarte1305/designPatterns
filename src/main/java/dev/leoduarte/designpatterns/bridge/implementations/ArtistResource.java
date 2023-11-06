package dev.leoduarte.designpatterns.bridge.implementations;

import dev.leoduarte.designpatterns.bridge.interfaces.Resource;

import java.util.Arrays;

public class ArtistResource implements Resource {
    @Override
    public String getName() {
//        System.out.printf("This is the getName implementation in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getSimpleName();
    }

    @Override
    public char[] getImageAsCharArray() {
//        System.out.printf("This is the getImageAsCharArray implementation in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getCanonicalName().toCharArray();
    }

    @Override
    public String getSnippet() {
//        System.out.printf("This is the getSnippet implementation in the class: %s\n", this.getClass().getSimpleName());
        return this.getClass().getPackageName();
    }

    @Override
    public String getUrl() {
//        System.out.printf("This is the getUrl implementation in the class: %s\n", this.getClass().getSimpleName());
        return Arrays.toString(this.getClass().getMethods());
    }
}
