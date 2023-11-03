package okhravi.command.implementations.receiver;

public class Lamp {
    private boolean onOff;
    private int bright = 10;

    public void turnOn() {
        if (!onOff) {
            System.out.printf("The %s was turned on.\n", this.getClass().getSimpleName());
            this.onOff = true;
        }
    }

    public void turnOff() {
        if (onOff) {
            System.out.printf("The %s was turned off.\n", this.getClass().getSimpleName());
            this.onOff = false;
        }
    }

    public void increaseBrightness() {
        if (onOff) {
            if (bright < 20) {
                bright += 1;
            }
            System.out.printf("Brightness: %d\n", bright);
        }
    }

    public void decreaseBrightness() {
        if (onOff) {
            if (bright > 0) {
                bright -= 1;
            }
            System.out.printf("Brightness: %d\n", bright);
        }
    }
}
