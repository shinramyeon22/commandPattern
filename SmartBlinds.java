package smarthome;
public class SmartBlinds {
    private int openness = 0;

    public void open() {
        openness = 100;
        System.out.println("Smart Blinds are OPEN (100%)");
    }

    public void close() {
        openness = 0;
        System.out.println("Smart Blinds are CLOSED (0%)");
    }

    public void raise() {
        if (openness < 100) {
            openness += 10;
            System.out.println("Smart Blinds raised to " + openness + "%");
        } else {
            System.out.println("Smart Blinds are fully open");
        }
    }

    public void lower() {
        if (openness > 0) {
            openness -= 10;
            System.out.println("Smart Blinds lowered to " + openness + "%");
        } else {
            System.out.println("Smart Blinds are fully closed");
        }
    }
}