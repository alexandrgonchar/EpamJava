package second_task.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryShop implements Shop {
    private ArrayList<Product> productList = new ArrayList<>();

    public GroceryShop (Product ... products) {
        productList.addAll(Arrays.asList(products));
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
