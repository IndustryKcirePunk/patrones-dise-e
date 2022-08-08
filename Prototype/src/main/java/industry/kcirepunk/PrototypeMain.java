package industry.kcirepunk;

import industry.kcirepunk.imp.PriceListImpl;
import industry.kcirepunk.imp.ProductItem;
import industry.kcirepunk.imp.PrototypeFactory;

public class PrototypeMain {
    public static void main(String[] args) {
        PriceListImpl standarPriceList = new PriceListImpl("Standar Price List");

        for (int c = 1; c <= 5; c++) {
            ProductItem item = new ProductItem("Product" + c , c * 2);
            standarPriceList.addProductItem(item);
        }

        PrototypeFactory.addPrototype(standarPriceList.getListName(), standarPriceList);

        PriceListImpl wholesalePriceList = (PriceListImpl) PrototypeFactory.getPrototype("Standar Price List");
        wholesalePriceList.setListName("Wholose Price List");

        for (ProductItem product : wholesalePriceList.getProducts()) {
            product.setPrice(product.getPrice() * 0.90);
        }

        PrototypeFactory.addPrototype(wholesalePriceList.getListName(), wholesalePriceList);

        PriceListImpl vipPriceList = (PriceListImpl) PrototypeFactory.getPrototype("Wholose Price List");
        vipPriceList.setListName("Vip Price List");

        for (ProductItem product : vipPriceList.getProducts()) {
            product.setPrice(product.getPrice() * 0.90);
        }

        PrototypeFactory.addPrototype(vipPriceList.getListName(), vipPriceList);

        System.out.println(standarPriceList);
        System.out.println(wholesalePriceList);
        System.out.println(vipPriceList);
    }
}
