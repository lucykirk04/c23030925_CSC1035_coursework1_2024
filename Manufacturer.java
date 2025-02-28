import java.util.ArrayList;
import java.util.List;

public class Manufacturer {
    private String name;
    private List<CarModel> carModels;

    public Manufacturer() {
        System.out.println("Manufacturer");
        this.carModels = new ArrayList<>();
    }

    public Manufacturer(String name) {
        this.name = name;
        this.carModels = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name; }

    public void addCarModel(CarModel carModel){
    carModels.add(carModel);
    }

    public List<CarModel> getCarModels(){
    return carModels;}

    public CarModel getMostExpensiveModel() {
        if (carModels.isEmpty()) return null;
        CarModel expensive = carModels.get(0);
        for (CarModel model : carModels) {
            if (model.getPrice() > expensive.getPrice()) {
                expensive = model;
            }
        }

        return expensive;

    }

    public double getRevenueByType(String type) {
        double totalRevenue = 0;
        for (CarModel model : carModels) {
            if (model.getType().equalsIgnoreCase(type)) {
                totalRevenue += model.getTotalRevenue();
            }
        }
        return totalRevenue;

    }

    @Override
    public String toString() {
        return "Manufacturer{name='" + name + "', carModels=" + carModels + "}";
    }

}

public static void main(String[] args){

}





