package smarthome;
public class SmartBlindsOpen implements Command {
    private SmartBlinds blinds;

    public SmartBlindsOpen(SmartBlinds blinds) {
        this.blinds = blinds;
    }

    @Override
    public void execute() {
        blinds.open();
    }
}