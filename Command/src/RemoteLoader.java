import commands.off.LightOffCommand;
import commands.off.StereoOffCommand;
import commands.on.LightOnCommand;
import commands.on.StereoOnCommand;
import devices.Light;
import devices.Stereo;

/**
 * Created by Igor Korotenko on 11/7/13.
 */

public class RemoteLoader {


    public static void main(String... args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnCommand, stereoOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }


}
