package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    private int  id;
    private String name;
    private double price;
    private int amount;
    private String description;

    public Product() {
    }

    public Product(int id, String name, double price, int amount, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        return "Sản phẩm{" +
                "Mã sp:" + id +
                ", Tên: '" + name + '\'' +
                ", Giá:" + numberFormat.format(price) +" vnđ"+
                ", Số lượng: " + amount +
                ", Mô tả: '" + description + '\'' +
                '}';
    }
}
