package com.exercise;

public class RemoteControl {
    private final Television television;    // Each remote control may work on only one television

    // Constructor
    public RemoteControl( Television television ) {
        this.television = television;
    }

    // Methods
    public void RaiseVolume() {
        television.RaiseVolume();
    }

    public void DecreaseVolume() {
        television.DecreaseVolume();
    }

    public void ChangeChannelUp() {
        television.ChangeChannelUp();
    }

    public void ChangeChannelDown() {
        television.ChangeChannelDown();
    }

    public void ChangeToChannel( short channel ) {
        television.ChangeToChannel( channel );
    }

    public short CheckVolume() {
        return television.getVolume();
    }

    public short CheckChannel() {
        return television.getChannel();
    }
}