package com.jansmerecki;

import com.jansmerecki.devices.Device;
import com.jansmerecki.devices.Radio;
import com.jansmerecki.devices.Tv;
import com.jansmerecki.remotes.AdvancedRemote;
import com.jansmerecki.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
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