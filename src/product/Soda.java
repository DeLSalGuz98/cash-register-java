package product;

public class Soda extends Product{
    private float litters;
    public Soda(String nameProduct, float purchasePrice, int quantity, float litters) {
        super(nameProduct, purchasePrice, quantity);
        this.litters = litters;
    }

    public float getLitters() {
        return litters;
    }

    public void setLitters(float litters) {
        if(litters > 0){
            this.litters = litters;
        }
    }
}
