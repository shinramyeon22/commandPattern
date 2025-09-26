package smarthome;
public class SmartCameraEnableNightVision implements Command {
    private SmartCamera camera;

    public SmartCameraEnableNightVision(SmartCamera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.enableNightVision();
    }
}