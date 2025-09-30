public class Car {
    private String brand;
    private String model;
    private short year;
    private double currentSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public short getYear() {
        return year;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setBrand( String brand ) {
        this.brand = brand;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public void setYear( short year ) {
        this.year = year;
    }

    public void setCurrentSpeed( double currentSpeed ) {
        this.currentSpeed = currentSpeed;
    }
    
    public void accelerate( ) {
        currentSpeed++;
    }

    public void breaking() {
        if( currentSpeed > 0 ) {
            currentSpeed--;
        }
    }
}