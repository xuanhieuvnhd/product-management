package service;

import connectJDBC.ConnectJDBC;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductServicelmpl implements ProductService {
    Connection connection = ConnectJDBC.connect();

    public ProductServicelmpl() {
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM quanlysanpham.product;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("productID");
                String name = rs.getString("productName");
                Double price = rs.getDouble("productPrice");
                int amount = rs.getInt("productAmount");
                String description = rs.getString("productDescription");
                products.add(new Product(id, name, price, amount, description));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void Save(Product product) {
        try {
            String sql = "INSERT INTO Product ( productName, productPrice, productAmount, productDescription) VALUES (?,?,?,?)";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3,product.getAmount());
            ps.setString(4,product.getDescription());
            System.out.println(ps.executeUpdate());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }

    @Override
    public Product findById(int id) {
        Product product= null;
        try {
            String sql = "Select * from product where productID=?";
            PreparedStatement ps= connection.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("productName");
                Double price = rs.getDouble("productPrice");
                int amount = rs.getInt("productAmount");
                String description = rs.getString("productDescription");
                product =new Product(id,name, price,amount,description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean update(Product product) {
        boolean checkUpdate = false;
        String sql = "update product set productName=?, productPrice=?, productAmount=?,productDescription=? where productID =?";
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setInt(3, product.getAmount());
            statement.setString(4, product.getDescription());
            statement.setInt(5, product.getId());
            checkUpdate = statement.executeUpdate() >0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkUpdate;
    }

    @Override
    public boolean remove(int id) {
        boolean rowDeleted= false;
        try {
            String sql="Delete from product where productID=?";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,id);
            rowDeleted=ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public List<Product> findProductByName(String product) {
        List<Product> products=new ArrayList<>();
        Product p= null;
        try {
            String sql ="select * from product productName like ? or productDescription like ?";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1, "%"+product+"%");
            ps.setString(2, "%"+product+"%");
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                int id= rs.getInt("productID");
                String name = rs.getString("productName");
                Double price = rs.getDouble("productPrice");
                int amount = rs.getInt("productAmount");
                String description = rs.getString("productDescription");
                products.add(new Product(id,name, price,amount,description));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
