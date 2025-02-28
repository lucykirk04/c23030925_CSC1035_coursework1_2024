public class Car{
    private String name;
    private double weight;
    private double price;
    private int numberSold;
    private String type; // hatchback, saloon, estate

    }

    public Car(String name, double weight, double price, int numberSold, String type){
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.numberSold = numberSold;
        this.type = type;

    }

    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public double getPrice(){
        return price;
    }
    public int getNumberSold(){
        return numberSold;
    }
    public String getType(){
        return type;
    }


}