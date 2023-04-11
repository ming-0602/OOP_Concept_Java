package Ex2;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
        this(0, false);
    }

    public Bicycle(int gearCount, boolean hasBell) {
        this.gearCount = gearCount;
        this.hasBell = hasBell;
    }

    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean hasBell) {
        super(price, length, height, weight, manufacturer, model);
        this.gearCount = gearCount;
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        String tem;
        if(isHasBell() == false){
             tem = "No";
        }
        else {
            tem = "Yes";
        }
        return "Price: " + getPrice() + "\n" +
                "Length: " + getLength() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Weight" + getWeight() + "\n" +
                "Manufacturer: " + getManufacturer() + "\n" +
                "Model: " + getModel() + "\n" +
                "Has bell: " + tem + "\n" +
                "Gear Count: " + getGearCount() + "\n";
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isHasBell() {

        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}
