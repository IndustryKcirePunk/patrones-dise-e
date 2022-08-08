package ws;

import imp.IServiceStackAbstractFactory;
import service.IEmployeeService;
import service.IProductsService;

public class WSServiceStackImp implements IServiceStackAbstractFactory {

    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceWSImpl();
    }

    @Override
    public IProductsService getProductsService() {
        return new ProductServiceWSImpl();
    }
}
