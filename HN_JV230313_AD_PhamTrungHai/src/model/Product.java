package model;

public class Product {
    private String Productid;
    private String productName;
    private  double productPrice;
    private  String description;
    private int stock;
    private Catalog catalog;
    private boolean status=true;

    public Product() {
    }

    public Product(String productid, String productName, double productPrice, String description, int stock, Catalog catalog, boolean status) {
        Productid = productid;
        this.productName = productName;
        this.productPrice = productPrice;
        this.description = description;
        this.stock = stock;
        this.catalog = catalog;
        this.status = status;
    }

    public String getProductid() {
        return Productid;
    }

    public void setProductid(String productid) {
        Productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Productid='" + Productid+ '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", catalog=" + catalog.getCatalogName() +
                ", status=" + status +
                '}';
    }
}
