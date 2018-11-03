package second_task.shop;

import java.util.ArrayList;
import java.util.List;

public class AppliancesShop implements Shop {
    private ArrayList<Product> productList = new ArrayList<>();

    public AppliancesShop (List<Product> list) {
        productList.addAll(list);
    }

    public AppliancesShop (Product product) {
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
