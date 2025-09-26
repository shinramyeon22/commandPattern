package smarthome;
public class SmartCamera {
    private boolean isRecording = false;
    private boolean isNightVisionOn = false;

    public void startRecording() {
        isRecording = true;
        System.out.println("Smart Camera is RECORDING");
    }

    public void stopRecording() {
        isRecording = false;
        System.out.println("Smart Camera stopped RECORDING");
    }

    public void enableNightVision() {
        isNightVisionOn = true;
        System.out.println("Smart Camera night vision ENABLED");
    }

    public void disableNightVision() {
        isNightVisionOn = false;
        System.out.println("Smart Camera night vision DISABLED");
    }
}