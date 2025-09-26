package smarthome;
public class SmartCameraStopRecording implements Command {
    private SmartCamera camera;

    public SmartCameraStopRecording(SmartCamera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.stopRecording();
    }
}