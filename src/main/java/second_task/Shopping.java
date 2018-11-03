package second_task;

import second_task.shop.AppliancesShop;
import second_task.shop.GroceryShop;
import second_task.shop.Product;

public class Shopping {
    public static void main(String[] args) {

        AppliancesShop appliancesShop = new AppliancesShop(new Product("Comp", 1000));
        GroceryShop groceryShop = new GroceryShop(new Product("Potato", 30));

        Wife wife = new Wife("potato");

        Husband husband = new Husband(wife);

        husband.addAllProduct(appliancesShop, groceryShop);
        husband.addAvailable();
        husband.respondToWife();
    }
}
