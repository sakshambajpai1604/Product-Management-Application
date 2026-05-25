import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // hey service, add the products

        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table", 2022));
        service.addProduct(new Product("iPhone 14", "Smartphone", "White Desk", 2023));
        service.addProduct(new Product("Samsung Galaxy S23", "Smartphone", "Black Glass Shelf", 2023));
        service.addProduct(new Product("Dell Inspiron", "Laptop", "Grey Office Desk", 2021));
        service.addProduct(new Product("HP Pavilion", "Laptop", "Blue Study Table", 2022));
        service.addProduct(new Product("Sony Bravia", "Television", "Black TV Unit", 2020));
        service.addProduct(new Product("LG Refrigerator", "Appliance", "Silver Kitchen Corner", 2021));
        service.addProduct(new Product("Boat Rockerz 550", "Headphones", "Red Gaming Desk", 2022));
        service.addProduct(new Product("Canon EOS 1500D", "Camera", "White Photo Studio Shelf", 2019));
        service.addProduct(new Product("Apple Watch Series 8", "Smartwatch", "Brown Bedside Table", 2023));
        service.addProduct(new Product("OnePlus Nord CE 3", "Smartphone", "Green Drawer", 2023));
        service.addProduct(new Product("Lenovo Legion 5", "Laptop", "Black Gaming Room Desk", 2022));
        service.addProduct(new Product("JBL Flip 6", "Speaker", "White TV Stand", 2021));
        service.addProduct(new Product("Mi Air Purifier", "Appliance", "Blue Bedroom Corner", 2020));
        service.addProduct(new Product("Logitech MX Master 3", "Mouse", "Grey Workstation", 2022));

//        List<Product> products = service.getAllProducts();
//        for(Product p: products) {
//            System.out.println(p);
//        }
//        System.out.println("==============================================");
//
//        System.out.println("a Particular product");
//
//        Product p = service.getProduct("Lenovo Legion 5");
//        System.out.println(p);

        System.out.println("==============================================");
        System.out.println("Products in a particular place");

        List<Product> prods = service.getProductByPlace("Black Glass Shelf");

        for(Product product: prods) {
            System.out.println(product);
        }

    }

}