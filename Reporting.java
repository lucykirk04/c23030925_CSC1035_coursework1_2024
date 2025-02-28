import java.util.ArrayList;
import java.util.List;

public class Reporting {
    private List<Manufacturer> manufacturers;

    public Reporting(){
        this.manufacturers = new ArrayList<>();
    }
    public void addManufacturer(Manufacturer manufacturer) {
        this.manufacturers.add(manufacturer);
    }
    public List<Manufacturer> getManufacturers(){
        return this.manufacturers;
    }
    public CarModel getMostExpensiveModel() {
        CarModel mostExpensive = null;
        for(Manufacturer manufacturer : this.manufacturers){
        CarModel expensive = manufacturer.getMostExpensiveModel();
        if(expensive != null && (mostExpensive == null || expensive.getPrice() > mostExpensive.getPrice())){
            mostExpensive = expensive;

        }
    }
        return mostExpensive;
}
 public Manufacturer getTopManufacturerByRevenue(String type){
    Manufacturer topManufacturer = null;
    double highestRevenue = 0;
    for(Manufacturer manufacturer : this.manufacturers){
        double revenue = manufacturer.getRevenueByType(type);
        if(revenue > highestRevenue){
            highestRevenue = revenue;
            topManufacturer = manufacturer;
        }
    }
    return topManufacturer;
 }

    @Override
    public String toString() {
        return "Reporting [manufacturers=" + manufacturers + "]";
    }
}