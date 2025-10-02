package com.exercise;

public class Television {
    private short volume;
    private short channel;

    // Constructor
    public Television() {
        volume = 1;     // min = 1 max = 99
        channel = 1;    // min = 1 max = 99
    }

    // Getters
    public short getVolume() {
        return volume;
    }

    public short getChannel() {
        return channel;
    }

    // Setters
    private void setVolume( short volume ) {
        this.volume = volume;
    }

    private void setChannel( short channel ) {
        this.channel = channel;
    }

    // Methods
    public void RaiseVolume() {
        if( getVolume() < 99 ) {
            setVolume( ( short )( volume + 1 ) );
        }
    }

    public void DecreaseVolume() {
        if( getVolume() > 1 ) {
            setVolume( ( short )( volume - 1 ) );
        }
    }

    public void ChangeChannelUp() {
        if( getChannel() < 99 ) {
            setChannel( ( short )( channel + 1 ) );
        }
    }

    public void ChangeChannelDown() {
        if( getChannel() < 1 ) {
            setChannel( ( short )( channel - 1 ) );
        }
    }

    public void ChangeToChannel( short channel ) {
        if( channel > 0 && channel < 100 ) {
            setChannel( channel );
        }
    }
}