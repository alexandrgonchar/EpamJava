package second_task;

import second_task.shop.Product;
import second_task.shop.Shop;

import java.util.ArrayList;

class Husband {
    private Wife wife;
    private ArrayList<String> wifeList;
    private ArrayList<Product> allProduct = new ArrayList<>();
    private ArrayList<Product> available = new ArrayList<>();

    Husband (Wife wife) {
        this.wife = wife;
        wifeList = new ArrayList<>(wife.getList());
    }

    void addAllProduct (Shop ... shops) {

        for (Shop shop : shops)
            allProduct.addAll(shop.getAllProducts());

    }

    void addAvailable () {

        for (Product product : allProduct) {

            for (String item : wifeList)
                if (item.equalsIgnoreCase(product.getName())) available.add(product);

        }
    }

    void respondToWife () {
        wife.printAll(allProduct);
        wife.printAvailable(available);
    }

}
