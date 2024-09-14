import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> supplies;

    public Inventory() {
        this.supplies = new HashMap<>();
    }

    public void addSupply(String item, int quantity) {
        supplies.put(item, supplies.getOrDefault(item, 0) + quantity);
    }

    public void removeSupply(String item, int quantity) {
        if (supplies.containsKey(item)) {
            int newQuantity = supplies.get(item) - quantity;
            if (newQuantity <= 0) {
                supplies.remove(item);
            } else {
                supplies.put(item, newQuantity);
            }
        }
    }

    public int checkStock(String item) {
        return supplies.getOrDefault(item, 0);
    }
}

