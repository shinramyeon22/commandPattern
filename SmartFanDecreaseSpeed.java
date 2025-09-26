package smarthome;
public class SmartFanDecreaseSpeed implements Command {
    private SmartFan fan;

    public SmartFanDecreaseSpeed(SmartFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.decreaseSpeed();
    }
}