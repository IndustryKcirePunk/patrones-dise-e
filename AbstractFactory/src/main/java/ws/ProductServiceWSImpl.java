package ws;

import service.IProductsService;

public class ProductServiceWSImpl implements IProductsService {

    private static final String[] PRODUCT = new String[]{"Refresco", "Jugo", "Fruta"};

    @Override
    public String[] getProducts() {
        return PRODUCT;
    }
}
