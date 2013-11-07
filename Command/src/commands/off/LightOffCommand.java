package commands.off;

import commands.Command;
import devices.Light;

/**
 * Created by Igor Korotenko on 11/7/13.
 */

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
