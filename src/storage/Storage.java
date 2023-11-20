package storage;

import java.util.ArrayList;

import product.*;
import cashRegister.Invoice;

public class Storage {
    private ArrayList<Product> storageProducts = new ArrayList<Product>();
    private ArrayList<Invoice> storageInvoice = new ArrayList<Invoice>();

    public Storage(){}
    public void SaveProduct(Product item){
        if (item != null){
            storageProducts.add(item);
        }
    }
    public Product FindProduct(int index){
        int storageSize = storageProducts.size();
        if(index > 0 && index <= storageSize){
            return storageProducts.get(index-1);
        }
        return null;
    }
    public void SaveInvoice(Invoice item){
        if(item != null){
            storageInvoice.add(item);
        }
    }
    public Invoice FindInvoice(int index){
        int storageSize = storageInvoice.size();
        if(index > 0 && index <= storageSize){
            return storageInvoice.get(index-1);
        }
        return null;
    }
    public ArrayList GetAllPurchaseInovoice(){
        ArrayList<Invoice> purchaseInvoice =new  ArrayList<Invoice>();
        for (Invoice item:storageInvoice) {
            if(item.getTypeInvoice().equals("Compra")){
                purchaseInvoice.add(item);
            }
        }
        return purchaseInvoice;
    }
    public ArrayList GetAllSellInovoice(){
        ArrayList<Invoice> sellInvoice =new  ArrayList<Invoice>();
        for (Invoice item:storageInvoice) {
            if(item.getTypeInvoice().equals("Venta")){
                sellInvoice.add(item);
            }
        }
        return sellInvoice;
    }
}
