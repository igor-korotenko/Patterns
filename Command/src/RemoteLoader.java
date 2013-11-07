import commands.off.LightOffCommand;
import commands.off.StereoOffCommand;
import commands.on.CeilingFanHightCommand;
import commands.on.CeilingFanLowCommand;
import commands.on.CeilingFanOffCommand;
import commands.on.LightOnCommand;
import commands.on.StereoOnCommand;
import devices.CeilingFan;
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

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanHightCommand ceilingFanHightCommand = new CeilingFanHightCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(2, ceilingFanHightCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceilingFanLowCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);

        remoteControl.undoButtonWasPushed();
    }


}
