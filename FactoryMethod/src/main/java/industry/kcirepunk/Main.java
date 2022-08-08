package industry.kcirepunk;

import industry.kcirepunk.dao.ProductDAO;
import industry.kcirepunk.entity.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product productA = new Product(3L, "Producto C", 100);
        Product productB = new Product(4L, "Producto D", 100);

        ProductDAO productDAO = new ProductDAO();

        productDAO.saveProduct(productA);
        productDAO.saveProduct(productB);

        List<Product> products = productDAO.findAllProducts();
        System.out.println("Product size: " + products.size());

        for (Product product : products) {
            System.out.println(product);
        }

    }

}
