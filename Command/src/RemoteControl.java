import java.util.ArrayList;

import commands.Command;

/**
 * Created by Igor Korotenko on 11/7/13.
 */

public class RemoteControl {
    private ArrayList<Command> onCommands = new ArrayList<Command>();
    private ArrayList<Command> offCommands = new ArrayList<Command>();

    public void setCommand(int cell, Command onCommand, Command offCommand) {
        onCommands.add(cell, onCommand);
        offCommands.add(cell, offCommand);
    }

    public void onButtonWasPushed(int cell) {
        Command command = onCommands.get(cell);
        command.execute();
    }

    public void offButtonWasPushed(int cell) {
        Command command = offCommands.get(cell);
        command.execute();
    }
}
