package smarthome;
public class SmartBlindsLower implements Command {
    private SmartBlinds blinds;

    public SmartBlindsLower(SmartBlinds blinds) {
        this.blinds = blinds;
    }

    @Override
    public void execute() {
        blinds.lower();
    }
}