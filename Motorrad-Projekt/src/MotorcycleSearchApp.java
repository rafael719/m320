import java.util.ArrayList;
import java.util.List;

public class MotorcycleSearchApp {
    public static void main(String[] args) {
        List<Motorcycle> motorcycles = new ArrayList<>();
        motorcycles.add(new SpecificMotorcycle("Yamaha", "MT-07", 200, "Sport", 8000, true));
        motorcycles.add(new SpecificMotorcycle("BMW", "R1250GS", 180, "Touring", 15000, false));
        motorcycles.add(new SpecificMotorcycle("Honda", "Africa Twin", 170, "Offroad", 14000, true));

        MotorcycleSearch search = new MotorcycleSearch(motorcycles);

        SearchCriteria speedCriteria = new SpeedCriteria(180);
        List<Motorcycle> results = search.search(speedCriteria);

        System.out.println("Search Results:");
        for (Motorcycle motorcycle : results) {
            System.out.println(motorcycle.getDetails());
        }
    }
}
