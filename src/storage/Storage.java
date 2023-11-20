package storage;

import java.util.ArrayList;
import product.*;

public class Storage {
    ArrayList<Product> storageProducts = new ArrayList<Product>();
    ArrayList<String> storagePurchasing = new ArrayList<String>();
    ArrayList<String> storageSelling = new ArrayList<String>();

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
}
