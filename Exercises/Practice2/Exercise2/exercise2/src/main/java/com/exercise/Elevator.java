package com.exercise;

public class Elevator {
    private short currentFloor;
    private short totalFloors;
    private short capacity;
    private short peopleInside;

    // Getters
    public short getCurrentFloor() {
        return currentFloor;
    }

    public short getTotalFloors() {
        return totalFloors;
    }

    public short getCapacity() {
        return capacity;
    }

    public short getPeopleInside() {
        return peopleInside;
    }

    // Setters
    public void setCurrentFloor(short currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setTotalFloors(short totalFloors) {
        this.totalFloors = totalFloors;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public void setPeopleInside(short peopleInside) {
        this.peopleInside = peopleInside;
    }

    // Constructor
    public Elevator( short capacity, short totalFloors ) {
        peopleInside = 0;
        currentFloor = 0; // 0 = ground floor, 1 = first floor
        this.capacity = capacity;
        this.totalFloors = totalFloors;
    }

    // Methods
    public void Enter() {
        if( peopleInside < capacity ) {
            peopleInside++;
            return;
        }
        System.out.println( "Not enough space!" );
    }

    public void GetOut() {
        if( peopleInside > 0 ) {
            peopleInside--;
            return;
        }
        System.out.println( "There's no one inside!" );
    }

    public void Ascend() {
        if( currentFloor < totalFloors ) {
            currentFloor++;
            return;
        }
        System.out.println( "Already on the top floor!" );
    }

    public void Descend() {
        if( currentFloor > 0 ) {
            currentFloor--;
            return;
        }
        System.out.println( "Already on the bottom floor!" );
    }
}