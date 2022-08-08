package industry.kcirepunk.factorymethod;

import java.sql.Connection;

public interface IDBAdapter {

    public Connection getConnection();

}
