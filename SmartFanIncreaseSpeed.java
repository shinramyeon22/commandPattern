package smarthome;
public class SmartFanIncreaseSpeed implements Command {
    private SmartFan fan;

    public SmartFanIncreaseSpeed(SmartFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.increaseSpeed();
    }
}