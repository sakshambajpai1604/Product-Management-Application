import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        return products.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        return products.stream()
                .filter(p -> {
                    String name = p.getName().toLowerCase();
                    String type = p.getType().toLowerCase();
                    String place = p.getPlace().toLowerCase();
                    return name.contains(str) || type.contains(str) || place.contains(str);
                })
                .collect(Collectors.toList());

    }

    public List<Product> getProductByPlace(String place) {
        return products.stream()
                .filter(p -> p.getPlace() != null && p.getPlace().equalsIgnoreCase(place))
                .collect(Collectors.toList());
    }

    public List<Product> getProductsOutOfWarranty(int currentYear) {
        return products.stream()
                .filter(p -> p.getWarrenty() < currentYear)
                .collect(Collectors.toList());
    }
}
