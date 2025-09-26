## Smart Home Automation

Imagine you're building a smart home automation system where various devices (lights, thermostat, music player, etc.) can be controlled remotely using a central hub or app. Each device has different functionalities, but you want to create a unified and flexible control mechanism.

Design a system that allows you to control multiple smart home devices with ease. Your goal is to create a solution where:

You can control a variety of devices from a central hub or app, sending commands like "Turn On," "Turn Off," "Increase Temperature," "Decrease Volume," etc.
Each device has unique actions associated with these commands. For example, turning on the lights might involve changing their brightness level, while turning on the music player may involve playing a specific playlist.
New devices can be seamlessly integrated into the system without modifying existing code. You want to ensure that adding a new device doesn't require changes to the central control logic.
Devices can be controlled without the central hub or app needing to understand the internal workings of each device. It should send high-level commands without needing low-level details.
Your challenge is to apply a design pattern that provides a flexible and scalable way to control a variety of smart home devices, ensuring that new devices can be added without disrupting the existing system's functionality.

## UML Diagram
![alt text](https://github.com/shinramyeon22/commandPattern/blob/main/commandPattern.png)

## Components

SmartHomeApp (Client): This represents the application that initializes and configures the smart home system. It interacts with the SmartHomeHub to set up and send commands.

SmartHomeHub (Invoker): The SmartHomeHub acts as an invoker, receiving commands from the SmartHomeApp and executing them. It has setCommand() and executeCommand() methods to manage and invoke commands.

Command (Interface): An interface defining the execute() method, which concrete command objects must implement. It ensures that all concrete commands have an execute() method.

SmartBlindsOpen (Concrete Command): A concrete command object representing the "open blinds" operation for the SmartBlinds. It encapsulates the open() method of the SmartBlinds object.

SmartBlindsClose (Concrete Command): A concrete command object representing the "close blinds" operation for the SmartBlinds. It encapsulates the close() method of the SmartBlinds object.

SmartCameraStartRecording (Concrete Command): A concrete command object representing the "start recording" operation for the SmartCamera. It encapsulates the startRecording() method of the SmartCamera object.

SmartCameraStopRecording (Concrete Command): A concrete command object representing the "stop recording" operation for the SmartCamera. It encapsulates the stopRecording() method of the SmartCamera object.

SmartFanOn (Concrete Command): A concrete command object representing the "turn on" operation for the SmartFan. It encapsulates the turnOn() method of the SmartFan object.

SmartFanOff (Concrete Command): A concrete command object representing the "turn off" operation for the SmartFan. It encapsulates the turnOff() method of the SmartFan object.

SmartBlinds (Receiver): The SmartBlinds object represents the device being controlled. It has open(), close(), raise(), and lower() methods to control its state.

SmartCamera (Receiver): The SmartCamera object represents the device being controlled. It has startRecording(), stopRecording(), enableNightVision(), and disableNightVision() methods to control its state.
SmartFan (Receiver): The SmartFan object represents the device being controlled. It has turnOn(), turnOff(), increaseSpeed(), and decreaseSpeed() methods to control its state.
