package commands.on;

import commands.Command;
import devices.Stereo;

/**
 * Created by Igor Korotenko on 11/7/13.
 */

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDvd();
        stereo.setVolume(11);
    }
}
