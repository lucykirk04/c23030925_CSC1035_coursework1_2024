public class CarModel {
    private String name;
    private int weight;
    private double price;
    private int numberSold;
    private String type; // hatchback, saloon, estate


    public CarModel(String name, int weight, double price, int numberSold, String type) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.numberSold = numberSold;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberSold() {
        return numberSold;
    }

    public String getType() {
        return type;
    }

    public double getTotalRevenue() {
        return price * numberSold;
        // Calculates total revenue of the car model
    }

@Override
    public String toString() {
        return "CarModel{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", numberSold=" + numberSold +
                ", type='" + type + '\'' +
                '}';
}

}


