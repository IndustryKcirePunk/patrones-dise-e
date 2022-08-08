package rest;

import service.IProductsService;

public class ProductServiceRestImpl implements IProductsService {

    private static final String[] PRODUCTS = new String[]{"Teclado", "Mouse", "Monitor"};

    @Override
    public String[] getProducts() {
        return PRODUCTS;
    }
}
