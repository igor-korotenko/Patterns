package devices;

/**
 * Created by Igor Korotenko on 11/7/13.
 */

public class Stereo {
    public void on() {
        System.out.println("Stereo is ON");
    }

    public void off() {
        System.out.println("Stereo is OFF");
    }

    public void setCd() {
        System.out.println("Stereo is CD");
    }

    public void setDvd() {
        System.out.println("Stereo is DVD");
    }

    public void setRadio() {
        System.out.println("Stereo is Radio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume is " + volume);
    }


}
