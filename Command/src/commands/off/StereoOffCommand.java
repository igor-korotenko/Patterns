package commands.off;

import commands.Command;
import devices.Stereo;

/**
 * Created by Igor Korotenko on 11/7/13.
 */

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
