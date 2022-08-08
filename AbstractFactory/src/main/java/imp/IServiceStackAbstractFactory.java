package imp;

import service.IEmployeeService;
import service.IProductsService;

public interface IServiceStackAbstractFactory {
    public IEmployeeService getEmployeeService();
    public IProductsService getProductsService();
}

