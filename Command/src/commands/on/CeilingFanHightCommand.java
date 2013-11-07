package commands.on;

import commands.Command;
import devices.CeilingFan;

import static devices.CeilingFan.*;

/**
 * Created by Igor Korotenko on 11/7/13.
 */

public class CeilingFanHightCommand implements Command {

    private CeilingFan ceilingFan;
    private Speed prevSpeed;

    public CeilingFanHightCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.setSpeed(Speed.HIGHT);
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case HIGHT:
                ceilingFan.setSpeed(Speed.HIGHT);
                break;
            case MEDIUM:
                ceilingFan.setSpeed(Speed.MEDIUM);
                break;
            case LOW:
                ceilingFan.setSpeed(Speed.LOW);
                break;
            case OFF:
                ceilingFan.setSpeed(Speed.OFF);
                break;
        }
    }
}
