package second_task;

import second_task.shop.Product;

import java.util.ArrayList;
import java.util.List;

public class Wife {

    private ArrayList<String> items = new ArrayList<>();

    public Wife (List<String> list) {
        items.addAll(list);
    }

    Wife (String product) {
        items.add(product);
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
