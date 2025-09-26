package smarthome;
public class SmartFanOn implements Command {
    private SmartFan fan;

    public SmartFanOn(SmartFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }
}