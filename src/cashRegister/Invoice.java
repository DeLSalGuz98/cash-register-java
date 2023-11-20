package cashRegister;

public class Invoice {
    private int quantity;
    private String nameProduct, typeInvoice;
    private float totalPrice;

    public Invoice() {
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        if(nameProduct != ""){
            this.nameProduct = nameProduct;
        }
    }

    public String getTypeInvoice() {
        return typeInvoice;
    }

    public void setTypeInvoice(int index) {
        switch (index){
            case 1:
                this.typeInvoice = "Compra";
                break;
            case 2:
                this.typeInvoice = "Venta";
            default:
                break;
        }
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float singlePrice) {
        if (singlePrice > 0){
            this.totalPrice = singlePrice * this.quantity;
        }
    }
}
