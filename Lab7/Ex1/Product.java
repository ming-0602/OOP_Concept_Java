package Ex1;
public class Product {
    private int id;
    private String name;
    private String description;
    private static int count = 100000;

    private static void incrementCount(){
//        int value = 1000000;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public Product(int id, String name, String description) {
        setName(name);
        setDescription(description);
        incrementCount();
        setId(count);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Product details are as follows: id: " + getId() + "  name: " + getName() + "  description: " + getDescription();
    }
}

