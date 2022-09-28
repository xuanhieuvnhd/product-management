package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServicelmpl implements ProductService{
    private static Map<Integer, Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1,"Sting",10000,30,"Nước tăng lực" ));
        products.put(2,new Product(2,"Pepsi",12000,50,"Nước ngọt có ga" ));
        products.put(3,new Product(3,"Heniken",24000,60,"Bia đức" ));
        products.put(4,new Product(4,"Vodka",120000,80,"Rượu nga" ));
        products.put(5,new Product(5,"Thăng long",10000,100,"Thuốc lá" ));
        products.put(6,new Product(6,"Tiên lãng",15000,120,"Thuốc lào" ));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void Save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.putIfAbsent(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findProductByName(String name) {
        int index = -1;
        int id = -1;
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)){
                index = i;
            }
        }
        id = productList.get(index).getId();
        return products.get(id);
    }
}
