package second_task.shop;

import java.util.List;

public interface Shop {

    List<Product> getAllProducts ();

    void addProduct (Product product);
}
