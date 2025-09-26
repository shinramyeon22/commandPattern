package smarthome;
public class SmartFan {
    private int speed = 0;
    public void turnOn() {
        speed = 1;
        System.out.println("Smart Fan is ON, speed set to " + speed);
    }

    public void turnOff() {
        speed = 0;
        System.out.println("Smart Fan is OFF");
    }

    public void increaseSpeed() {
        if (speed < 3) {
            speed += 1;
            System.out.println("Smart Fan speed increased to " + speed);
        } else {
            System.out.println("Smart Fan speed at maximum");
        }
    }

    public void decreaseSpeed() {
        if (speed > 0) {
            speed -= 1;
            System.out.println("Smart Fan speed decreased to " + speed);
        } else {
            System.out.println("Smart Fan is OFF, cannot decrease speed");
        }
    }
}