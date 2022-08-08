package industry.kcirepunk.imp;

import industry.kcirepunk.factorymethod.IDBAdapter;
import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDBAdapter implements IDBAdapter {
    static {
        //Bloque para registrar el Driver de MySQL
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/database_2", "root", "admin");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
