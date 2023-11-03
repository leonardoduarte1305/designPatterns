package okhravi.factory.implementations;

import okhravi.factory.abstractions.Product;

import java.util.UUID;

public class MobilePhone extends Product {
    private final int screenSizeX;
    private final int screenSizeY;

    public MobilePhone(UUID uuid, String name, int screenSizeX, int screenSizeY) {
        super(uuid, name);
        this.screenSizeX = screenSizeX;
        this.screenSizeY = screenSizeY;
    }

    public int getScreenSizeX() {
        return screenSizeX;
    }

    public int getScreenSizeY() {
        return screenSizeY;
    }
}
