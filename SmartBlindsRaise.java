package smarthome;
public class SmartBlindsRaise implements Command {
    private SmartBlinds blinds;

    public SmartBlindsRaise(SmartBlinds blinds) {
        this.blinds = blinds;
    }

    @Override
    public void execute() {
        blinds.raise();
    }
}