package com.exercise;

public class Clock {
    private short hours;
    private short minutes;

    // Constructor
    public Clock() {
        hours = 0;
        minutes = 0;
    }

    // Getters
    public short getHours() {
        return hours;
    }

    public short getMinutes() {
        return minutes;
    }

    // Setters
    private void setHours( short hours ) {
        this.hours = hours;
    }

    private void setMinutes( short minutes ) {
        this.minutes = minutes;
    }

    // Methods
    public String displayTime() {
        return getHours() + ":" + getMinutes();
    }

    public void clockEvent() {
        if( hours == 23 && minutes == 59 ) {
            setHours( ( short )0 );
            setMinutes( ( short )0 );
        } else if( hours != 23 && minutes == 59 ) {
            setHours( ( short )( hours + 1 ));
            setMinutes( ( short )0 );
        } else {
            setMinutes( ( short )( minutes + 1 ) );
        }
    }
}