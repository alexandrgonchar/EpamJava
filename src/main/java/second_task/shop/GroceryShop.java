package second_task.shop;

import java.util.ArrayList;
import java.util.List;

public class GroceryShop implements Shop {
    private ArrayList<Product> productList = new ArrayList<>();

    public GroceryShop (List<Product> list) {
        productList.addAll(list);
    }

    public GroceryShop (Product product) {
        productList.add(product);
    }

    @Override
    public void addProduct (Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }
}
