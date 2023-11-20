package product;

public class Product {
    protected String nameProduct;
    protected float purchasePrice, sellingPrice;
    protected int quantity;

    int profit = 15;

    protected Product(String nameProduct, float purchasePrice, int quantity) {
        this.nameProduct = nameProduct;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = (this.purchasePrice + (this.purchasePrice * profit/100));
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        if(nameProduct != ""){
            this.nameProduct = nameProduct;
        }
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        if(purchasePrice >0){
            this.purchasePrice = purchasePrice;
            setSellingPrice(this.purchasePrice);
        }
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    private void setSellingPrice(float purchasePrice) {
        if(purchasePrice > 0){
            this.sellingPrice = (purchasePrice + (purchasePrice * profit/100));
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0){
            this.quantity = quantity;
        }
    }
}
