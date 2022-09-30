package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void Save(Product product);
    Product findById(int id);
    boolean update(Product product);
    boolean remove(int id);
    List<Product> findProductByName(String name);
}
