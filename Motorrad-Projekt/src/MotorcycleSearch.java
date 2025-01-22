import java.util.ArrayList;
import java.util.List;

class MotorcycleSearch {
    private List<Motorcycle> motorcycles;

    public MotorcycleSearch(List<Motorcycle> motorcycles) {
        this.motorcycles = motorcycles;
    }

    public List<Motorcycle> search(SearchCriteria criteria) {
        List<Motorcycle> results = new ArrayList<>();
        for (Motorcycle motorcycle : motorcycles) {
            if (criteria.matches(motorcycle)) {
                results.add(motorcycle);
            }
        }
        return results;
    }
}
