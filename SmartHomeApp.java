package smarthome;
public class SmartHomeApp {
    public static void main(String[] args) {
        SmartBlinds smartBlinds = new SmartBlinds();
        SmartCamera smartCamera = new SmartCamera();
        SmartFan smartFan = new SmartFan();

        Command SmartBlindsOpen = new SmartBlindsOpen(smartBlinds);
        Command SmartBlindsClose = new SmartBlindsClose(smartBlinds);
        Command SmartBlindsRaise = new SmartBlindsRaise(smartBlinds);
        Command SmartBlindsLower = new SmartBlindsLower(smartBlinds);

        Command SmartCameraStartRecording = new SmartCameraStartRecording(smartCamera);
        Command SmartCameraStopRecording = new SmartCameraStopRecording(smartCamera);
        Command SmartCameraEnableNightVision = new SmartCameraEnableNightVision(smartCamera);
        Command SmartCameraDisableNightVision = new SmartCameraDisableNightVision(smartCamera);

        Command SmartFanOn = new SmartFanOn(smartFan);
        Command SmartFanOff = new SmartFanOff(smartFan);
        Command SmartFanIncreaseSpeed = new SmartFanIncreaseSpeed(smartFan);
        Command SmartFanDecreaseSpeed = new SmartFanDecreaseSpeed(smartFan);

        SmartHomeHub hub = new SmartHomeHub();
        hub.setCommand("Blinds_Open", SmartBlindsOpen);
        hub.setCommand("Blinds_Close", SmartBlindsClose);
        hub.setCommand("Blinds_Raise", SmartBlindsRaise);
        hub.setCommand("Blinds_Lower", SmartBlindsLower);

        hub.setCommand("Camera_Start_Recording", SmartCameraStartRecording);
        hub.setCommand("Camera_Stop_Recording", SmartCameraStopRecording);
        hub.setCommand("Camera_Enable_Night_Vision", SmartCameraEnableNightVision);
        hub.setCommand("Camera_Disable_Night_Vision", SmartCameraDisableNightVision);

        hub.setCommand("Fan_On", SmartFanOn);
        hub.setCommand("Fan_Off", SmartFanOff);
        hub.setCommand("Fan_Increase_Speed", SmartFanIncreaseSpeed);
        hub.setCommand("Fan_Decrease_Speed", SmartFanDecreaseSpeed);

        hub.setCommand("Fan_On", SmartFanOn);
        hub.setCommand("Fan_Off", SmartFanOff);
        hub.setCommand("Fan_Increase_Speed", SmartFanIncreaseSpeed);
        hub.setCommand("Fan_Decrease_Speed", SmartFanDecreaseSpeed);

        System.out.println("\n~Simulating Smart Home Control~\n");
        hub.executeCommand("Blinds_Open");
        hub.executeCommand("Blinds_Raise");
        hub.executeCommand("Blinds_Lower");
        hub.executeCommand("Blinds_Close");
        hub.executeCommand("Camera_Start_Recording");
        hub.executeCommand("Camera_Enable_Night_Vision");
        hub.executeCommand("Camera_Disable_Night_Vision");
        hub.executeCommand("Camera_Stop_Recording");
        hub.executeCommand("Fan_On");
        hub.executeCommand("Fan_Increase_Speed");
        hub.executeCommand("Fan_Decrease_Speed");
        hub.executeCommand("Fan_Off");
    }
}