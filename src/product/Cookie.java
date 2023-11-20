package product;

public class Cookie extends Product{
    private String flavour;

    public Cookie(String nameProduct, float purchasePrice, int quantity, String flavour) {
        super(nameProduct, purchasePrice, quantity);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        if(flavour != ""){
            this.flavour = flavour;
        }
    }
}
