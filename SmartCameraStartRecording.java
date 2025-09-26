package smarthome;
public class SmartCameraStartRecording implements Command {
    private SmartCamera camera;

    public SmartCameraStartRecording(SmartCamera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.startRecording();
    }
}