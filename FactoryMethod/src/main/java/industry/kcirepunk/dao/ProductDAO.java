package industry.kcirepunk.dao;

import industry.kcirepunk.entity.Product;
import industry.kcirepunk.factorymethod.DBFactory;
import industry.kcirepunk.factorymethod.DBType;
import industry.kcirepunk.factorymethod.IDBAdapter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private IDBAdapter dbAdapter;

    public ProductDAO() {
        dbAdapter = DBFactory.getDBadapter(DBType.Oracle);
    }

    public List<Product> findAllProducts() {
        Connection conn = dbAdapter.getConnection();
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("SELECT idProductos, productName, productPrice FROM productos");
            ResultSet results = statement.executeQuery();
            while (results.next()) {
                productList.add(new Product(
                        results.getLong(1),
                        results.getString(2),
                        results.getDouble(3)
                ));
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean saveProduct(Product product) {
        Connection conn = dbAdapter.getConnection();
        try {
            PreparedStatement statement = conn.prepareStatement("INSERT INTO productos(idProductos, productName, productPrice) VALUES(?,?,?)");
            statement.setLong(1, product.getIdProduct());
            statement.setString(2, product.getProductName());
            statement.setDouble(3, product.getPrice());
            statement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
