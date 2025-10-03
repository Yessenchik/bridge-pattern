import devices.Device;
import devices.TV;
import devices.Radio;
import remotes.AdvancedRemote;
import remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testing(new TV());
        testing(new Radio());
    }

    public static void testing(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}