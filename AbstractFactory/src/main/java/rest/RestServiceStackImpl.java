package rest;

import imp.IServiceStackAbstractFactory;
import service.IEmployeeService;
import service.IProductsService;

public class RestServiceStackImpl implements IServiceStackAbstractFactory {
    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceRestImp();
    }

    @Override
    public IProductsService getProductsService() {
        return new ProductServiceRestImpl();
    }
}
