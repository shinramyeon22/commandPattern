package smarthome;
public class SmartBlindsClose implements Command {
    private SmartBlinds blinds;

    public SmartBlindsClose(SmartBlinds blinds) {
        this.blinds = blinds;
    }

    @Override
    public void execute() {
        blinds.close();
    }
}