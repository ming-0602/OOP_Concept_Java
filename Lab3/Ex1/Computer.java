package Ex1;

class Computer {
    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;

//    String manufacturer, String type, double speed, int RAM, double price

    public Computer(String manufacturer, String type, double speed, int RAM, double price){
        this.manufacturer = manufacturer;
        this.type = type;
        this.speed = speed;
        this.RAM = RAM;
        this.price = price;
    }

    public Computer(){
        this.manufacturer = "Not availble";
        this.type = "Not available";
        this.speed =0;
        this.RAM = 0;
        this.price = 0;
    }




    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
//        this.price = price;
        if(price > 0){
            this.price = price;
        }
    }

    @Override
    public String toString(){
        return "Manufacturer: " + getManufacturer() +
                " Type: " + getType() +
                " Speed: " + getSpeed() +
                " RAM: " + getRAM() +
                " Price: " + getPrice();
    }
}
