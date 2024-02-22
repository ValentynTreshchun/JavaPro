package ua.hillel.treshchun.lessons.lesson2Homework;

public class Car {
    private String modelName;
    private double engineDisplacement;
    private double fuelLevel;
    private double mileage;
    private double batteryLevel;
    private boolean immobilizerStatus;

    public Car() {
        modelName = "Default model";
        engineDisplacement = 5;
        fuelLevel = 10;
        mileage = 0;
        batteryLevel = 13;
        immobilizerStatus = false;
    }

    public Car(String modelName, int engineDisplacement, double fuelLevel, double mileage, double batteryLevel, boolean immobilizerStatus) {
        this.modelName = modelName;
        this.engineDisplacement = engineDisplacement;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
        this.batteryLevel = batteryLevel;
        this.immobilizerStatus = immobilizerStatus;
    }

    public boolean start () {
        System.out.println("\nCar \"" + modelName + "\" start sequence initiated" );
        if (startElectricity() && startFuelSystem() && startCommand()) {
            System.out.println("Car startup complete");
            return true;
        }
        System.out.println("Error: Overall car startup failure");
        return false;
    }

    private boolean startElectricity() {
        if (batteryLevel >= 10.5) {
            System.out.println("... electrical system startup complete;");
            return true;
        }
        System.out.println("... error: battery status low");
        return false;
    }

    private boolean startCommand() {
        if (immobilizerStatus) {
            System.out.println("... start command allowed;");
            return true;
        }
        System.out.println("... error: startup command failure");
        return false;
    }

    private boolean startFuelSystem() {
        if (fuelLevel > 0.5) {
            System.out.println("... fuel system startup complete;");
            return true;
        }
        System.out.println("... error: fuel level low");
        return false;
    }
}
