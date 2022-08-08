package imp;

import util.PropertiesUtil;

import java.util.Properties;

public class ServiceStackAbstractFactory {

    public ServiceStackAbstractFactory() {}

    public static IServiceStackAbstractFactory createServiceFactory() {
        try {
            return (IServiceStackAbstractFactory) Class.forName("ws.WSServiceStackImp").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
