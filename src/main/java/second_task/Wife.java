package second_task;

import second_task.shop.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Wife {

    private ArrayList<String> items = new ArrayList<>();

    Wife (String ... products) {
        items.addAll(Arrays.asList(products));
    }

    ArrayList<String> getList () {
        return items;
    }

    void printAll (ArrayList<Product> allProduct) {

        System.out.println("Total list: ");

        for (Product product : allProduct) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }

        System.out.println();
        System.out.println();
    }

    void printAvailable (ArrayList<Product> available) {

        int sum = 0;
        System.out.println("Bought: ");

        for (Product product : available) {
            System.out.println(product.getName() + " - " + product.getPrice());
            sum += product.getPrice();
        }

        System.out.println("Total price =" + sum);
    }
}
