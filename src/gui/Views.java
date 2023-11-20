package gui;

import product.Product;
import storage.Storage;

public class Views {
    Storage newstorage = new Storage();
    private void SetTitle(String title){
        System.out.println("-----------------------------------------");
        System.out.println("\t\t\t"+title.toUpperCase());
        System.out.println("-----------------------------------------");
    }
    public void StartMenu(){
        SetTitle("menu de inicio");
        System.out.println("\t\t1. Comprar Mercancia");
        System.out.println("\t\t2. Vender Productos");
        System.out.println("\t\t3. Registro de Compras");
        System.out.println("\t\t4. Registro de Ventas");
        System.out.println("\t\t5. Salir");
        System.out.println("-----------------------------------------");
    }
    public void ShowBuyMenu(){
        SetTitle("comprar productos");
        System.out.println("\t\t1. Galleta Chom");
        System.out.println("\t\t2. Galleta Rellenitas");
        System.out.println("\t\t3. Gaeosa Inka-Cola");
        System.out.println("\t\t4. Gaseosa Coca-Cola");
        System.out.println("\t\t5. Regresar");
        System.out.println("-----------------------------------------");
    }
    public void ShowSaleMenu(){
        SetTitle("vender productos");
        System.out.println("\t\t1. Galleta Chom");
        System.out.println("\t\t2. Galleta Rellenitas");
        System.out.println("\t\t3. Gaeosa Inka-Cola");
        System.out.println("\t\t4. Gaseosa Coca-Cola");
        System.out.println("\t\t5. Regresar");
        System.out.println("-----------------------------------------");

    }
    public void ShowDetailProduct(){
        System.out.println("|N°\t|  PRODUCTO\t\t|  CANTIDAD\t|  PRECIO\t|");
        System.out.println("----------------------------------------------");
    }
    public void ShowPurchases(){
        SetTitle("registro de compras");
        System.out.println("|TYPE\t|  PRODUCTO\t\t|  CANTIDAD\t|  PRECIO TOTAL\t|");
        System.out.println("----------------------------------------------");
    }
    public void ShowSales(){
        SetTitle("registro de ventas");
        System.out.println("|TYPE\t|  PRODUCTO\t\t|  CANTIDAD\t|  PRECIO TOTAL\t|");
        System.out.println("----------------------------------------------");
    }
}
