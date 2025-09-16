

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected String engineType;
    private boolean isRunning;
    private String registrationNumber;    
    public Vehicle(){
        brand = "";
        model = "";
        registrationNumber = "";
        engineType = "";
        isRunning = false;
        System.out.println("Vehicle default constructor called");
    }  
    public Vehicle(String brand, String model, int year, String engineType){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.isRunning = false;
        registrationNumber = String.valueOf((int)(Math.random() * 100));
        System.out.println("Vehicle parameterized constructor called");
    }
    public void start(){
        isRunning = true; System.out.println("Vehicle started");
    }
    public void stop(){
        isRunning = false; System.out.println("Vehicle stopped");
    }
    public String getVehicleInfo(){
        String vehicleInfo = String.format("Vehicle Information:\n" +
                             "Brand: %s\n" +
                             "Model: %s\n" +
                             "Year: %d\n" + 
                             "Engine Type: %s\n" +
                             "Registration Number: %s\n" +
                             "Status: %s",
                             brand, model, year, engineType, registrationNumber, 
                             (isRunning ? "Running" : "Stopped"));
        return vehicleInfo;
    }
    public void displaySpecs(){
        System.out.printf("Model: %s\nEngine Type: %s\nStatus: %s",model, engineType, (isRunning?"Running":"Stopped"));
    }
    public String getRegistrationNumber(){
        return this.registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public boolean isRunning(){
        return this.isRunning;
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry", 2020, "V6", 4, "Hybrid", "Automatic");
        car1.brand = "Honda";
        car1.start();
        car1.displaySpecs();
        car1.openTrunk();
        car1.playRadio();
        car2.start();
    }
}
class Car extends Vehicle{
    private int numberOfDoors;
    private String fuelType;
    private String transmissionType;
    public Car() {
        super();
        numberOfDoors = 4;
        fuelType = "Petrol";
        transmissionType = "Manual";
        System.out.println("Car default constructor called");
    }
    public Car(String brand, String model, int year, String engineType, int numberOfDoors,String fuelType, String transmissonType){
        super(brand, model, year, engineType);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.transmissionType = transmissonType;
        System.out.println("Car parameterized constructor called");
    }
    @Override
    public void start(){
        super.start();
        System.out.println("Car started");
    }
    @Override
    public void displaySpecs() {
        System.out.printf("Model: %s\nEngine Type: %s\n", model, engineType);
        System.out.printf("\nNumber of Doors: %d\nFuel Type: %s\nTransmission Type: %s", numberOfDoors, fuelType, transmissionType);
    }
    public void openTrunk(){
        System.out.println("Trunk opened");
    }
    public void playRadio(){
        System.out.println("Radio playing music");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry", 2020, "V6", 4, "Hybrid", "Automatic");
        car1.brand = "Honda";
        car1.start();
        car1.displaySpecs();
        car1.openTrunk();
        car1.playRadio();
        car2.start();
    }
}
