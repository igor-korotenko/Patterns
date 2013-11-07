package devices;

/**
 * Created by Igor Korotenko on 11/7/13.
 */

public class CeilingFan {

    private Speed speed;

    public static enum Speed {
        HIGHT(3), MEDIUM(2), LOW(1), OFF(0);
        private final int value;

        Speed(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
        System.out.println("Ceiling fan is " + speed.getValue() + " now");
    }
}
