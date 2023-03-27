package Products;

public abstract  class Products {
    int price;
    int UUID;
    String productNumber;
    String Brand;

    public Products(int price, int UUID, String productNumber, String brand) {
        this.price = price;
        this.UUID = UUID;
        this.productNumber = productNumber;
        Brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
