package exercises;

/*
*
* You have a Java class hierarchy representing different vehicles:
* Vehicle is the base class, and Car and Motorcycle are subclasses that inherit from Vehicle.
* Your task is to convert the above Java class hierarchy (Vehicle, Car, and Motorcycle)
* into Kotlin classes, preserving their functionality and inheritance relationship.
*
*/

class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println("Starting the engine of " + brand);
    }

    public boolean isFourWheeler() {
        return false;
    }
}

class Car extends Vehicle {
    private boolean isAutomatic;

    public Car(String brand, boolean isAutomatic) {
        super(brand);
        this.isAutomatic = isAutomatic;
    }

    @Override
    public boolean isFourWheeler() {
        return true;
    }

}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }
}

