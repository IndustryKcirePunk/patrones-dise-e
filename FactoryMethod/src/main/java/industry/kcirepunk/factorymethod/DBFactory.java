package industry.kcirepunk.factorymethod;

import industry.kcirepunk.imp.MySQLDBAdapter;
import industry.kcirepunk.imp.OracleDBAdapter;

public class DBFactory {

    public static IDBAdapter getDBadapter(DBType dbType) {
        switch (dbType) {
            case MySQL:
                return new MySQLDBAdapter();
            case Oracle:
                return new OracleDBAdapter();
            default:
                throw new IllegalArgumentException("No soportado");
        }
    }

}
