package smarthome;

public class SmartCameraDisableNightVision implements Command {
    private SmartCamera camera;

    public SmartCameraDisableNightVision(SmartCamera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.disableNightVision();
    }
}