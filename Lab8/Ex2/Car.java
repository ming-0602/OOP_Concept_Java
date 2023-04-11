package Ex2;

public class Car extends Vehicle {
    private int maxPassenger;
    private String registrationNumber;

    public Car(){
        this(0, "No registration number specified");
    }

    public Car(int maxPassenger, String registrationNumber) {
        this.maxPassenger = maxPassenger;
        this.registrationNumber = registrationNumber;
//        setRegistrationNumber(registrationNumber);
    }

    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassenger, String registrationNumber) {
        super(price, length, height, weight, manufacturer, model);
        this.maxPassenger = maxPassenger;
//        this.registrationNumber = registrationNumber;
        setRegistrationNumber(registrationNumber);
    }

    @Override
    public String toString() {
//        return "Max passengers: " + getMaxPassenger() + "\n" +
//                "Registration Number: " + getRegistrationNumber() + "\n";

//        return "Price: " + getPrice() + "\n" +
//                "Length: " + getLength() + "\n" +
//                "Height: " + getHeight() + "\n" +
//                "Weight" + getWeight() + "\n" +
//                "Manufacturer: " + getManufacturer() + "\n" +
//                "Model: " + getModel() + "\n" +
//                "Max passengers: " + getMaxPassenger() + "\n" +
//                "Registration Number: " + getRegistrationNumber() + "\n";
        return super.toString() +
                "Max passengers: " + getMaxPassenger() + "\n" +
                "Registration Number: " + getRegistrationNumber() + "\n";
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
//        Validator vd = new Validator();
        if(Validator.isValidRegistrationNumber(registrationNumber)){
            this.registrationNumber = registrationNumber;
        }else {
//            setRegistrationNumber("Invalid Registration Number");
            this.registrationNumber = "Invalid Registration Number";
        }
    }
}
