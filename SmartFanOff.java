package smarthome;
public class SmartFanOff implements Command {
    private SmartFan fan;

    public SmartFanOff(SmartFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }
}