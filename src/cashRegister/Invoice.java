package cashRegister;

public class Invoice {
    private int numberInvoice, quantity;
    private String nameProduct, descriptionInvoice, typeInvoice;
    private float totalPrice;

    public Invoice() {
    }

    public int getNumberInvoice() {
        return this.numberInvoice;
    }

    public void setNumberInvoice(int numberInvoice) {
        //TODO: try to add an number invoice automaticly
        this.numberInvoice = numberInvoice;
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

    public String getDescriptionInvoice() {
        return descriptionInvoice;
    }

    public void setDescriptionInvoice(String descriptionInvoice) {
        if(descriptionInvoice!=""){
            this.descriptionInvoice = descriptionInvoice;
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
