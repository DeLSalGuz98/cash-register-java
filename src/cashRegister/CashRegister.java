package cashRegister;

import product.Cookie;
import product.Soda;
import storage.Storage;

import java.util.ArrayList;

public class CashRegister {
    public Storage newStorage = new Storage();
    public void StartStore(){
        Cookie chom = new Cookie("Galleta Chom", 0.8f, 20, "naranja");
        Cookie rellenita = new Cookie("Galleta Rellenita", 0.3f, 30, "chocolate");
        Soda inka = new Soda("Inka-Cola", 5.5f, 10, 2.5f);
        Soda coca = new Soda("Coca-Cola", 6.8f, 10, 2.5f);
        newStorage.SaveProduct(chom);
        newStorage.SaveProduct(rellenita);
        newStorage.SaveProduct(inka);
        newStorage.SaveProduct(coca);
    }
    private void CreateInvoice(String nameProduct, int option, int quantity, float price){
        Invoice newInvoice = new Invoice();
        newInvoice.setNameProduct(nameProduct);
        newInvoice.setTypeInvoice(option);
        newInvoice.setQuantity(quantity);
        newInvoice.setTotalPrice(price);

        newStorage.SaveInvoice(newInvoice);
    }
    public String BuyProduct(int index, int quantity){
        String message ="";
        if(index == 1 || index == 2){
            Cookie mycookie = (Cookie)newStorage.FindProduct(index);
            int newQuantity = mycookie.getQuantity() + quantity;
            mycookie.setQuantity(newQuantity);
            CreateInvoice(mycookie.getNameProduct(), 1, quantity, mycookie.getPurchasePrice());
            message = "Compra de galletas Satisfactoria";
        }else if(index == 3 || index == 4){
            Soda mySoda = (Soda)newStorage.FindProduct(index);
            int newQuantity = mySoda.getQuantity() + quantity;
            mySoda.setQuantity(newQuantity);
            CreateInvoice(mySoda.getNameProduct(), 1, quantity, mySoda.getPurchasePrice());
            message = "Compra de gaseosa Satisfactoria";
        }else{
            return "Compra no Realizada";
        }
        return message;
    }
    //vender items
    public String SellProduct(int index, int quantity){
        String message="";
        if(index == 1 || index == 2){
            Cookie mycookie = (Cookie)newStorage.FindProduct(index);
            if(mycookie.getQuantity() >= quantity){
                int newQuantity = mycookie.getQuantity() - quantity;
                mycookie.setQuantity(newQuantity);
                CreateInvoice(mycookie.getNameProduct(), 2, quantity, mycookie.getSellingPrice());
            }
            message = "Venta de galletas Satisfactoria";
        }else if(index == 3 || index == 4){
            Soda mySoda = (Soda)newStorage.FindProduct(index);
            if(mySoda.getQuantity() >= quantity){
                int newQuantity = mySoda.getQuantity() - quantity;
                mySoda.setQuantity(newQuantity);
                CreateInvoice(mySoda.getNameProduct(), 2, quantity, mySoda.getSellingPrice());
            }
            message = "Venta de gaseosa Satisfactoria";
        }else{
            return "Venta no Realizada";
        }
        return message;
    }
    public ArrayList GetAllPurchaseInvoice(){
        return  newStorage.GetAllPurchaseInovoice();
    }
    public ArrayList GetAllSellInvoice(){
        return newStorage.GetAllSellInovoice();
    }
    //registrar ventas

}
