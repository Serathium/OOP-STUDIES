package com.exercise;

public class Main {
    public static void main(String[] args) {
       Elevator elevator1 = new Elevator( ( short )6, ( short )2 );
       elevator1.Ascend();
       System.out.println( "Current floor: " + elevator1.getCurrentFloor() );
       elevator1.Ascend();
       System.out.println( "Current floor: " + elevator1.getCurrentFloor() );
       elevator1.Ascend();
       elevator1.Descend();
       System.out.println( "Current floor: " + elevator1.getCurrentFloor() );
       elevator1.GetOut();
       elevator1.Enter();
       System.out.println( "People inside: " + elevator1.getPeopleInside() );
       elevator1.GetOut();
       System.out.println( "People inside: " + elevator1.getPeopleInside() );
       elevator1.Descend();
       System.out.println( "Current floor: " + elevator1.getCurrentFloor() );
       elevator1.Descend();
    }
}