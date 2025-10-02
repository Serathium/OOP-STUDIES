package com.exercise;

public class Main {
    public static void main(String[] args) {
        Television television1 = new Television();
        RemoteControl remotecontrol1 = new RemoteControl( television1 );

        System.out.println( "Current volume: " + remotecontrol1.CheckVolume() );
        remotecontrol1.RaiseVolume();
        System.out.println( "Current volume: " + remotecontrol1.CheckVolume() );
        remotecontrol1.DecreaseVolume();
        System.out.println( "Current volume: " + remotecontrol1.CheckVolume() );
        remotecontrol1.DecreaseVolume();    // Doesn't decrese further
        System.out.println( "Current volume: " + remotecontrol1.CheckVolume() );

        System.out.println( "Current channel: " + remotecontrol1.CheckChannel());
        remotecontrol1.ChangeToChannel( ( short )200 ); // works as intended
        System.out.println( "Current channel: " + remotecontrol1.CheckChannel());
        remotecontrol1.ChangeChannelUp();
        System.out.println( "Current channel: " + remotecontrol1.CheckChannel());
    }
}