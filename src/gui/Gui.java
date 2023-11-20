package gui;

import java.util.ArrayList;
import java.util.Scanner;
import cashRegister.CashRegister;
import cashRegister.Invoice;
import product.Cookie;
import product.Product;
import product.Soda;
import storage.Storage;

public class Gui {
    Views newGui = new Views();
    CashRegister newRegister = new CashRegister();
    Scanner key = new Scanner(System.in);

    public void StartGui() {
        newRegister.StartStore();
        StartStore();
    }

    public void StartStore(){
        newGui.StartMenu();
        System.out.print("ingrese una opcion: \n");
        int option = key.nextInt();
        switch (option){
            case 1:
                BuyInterface();
                break;
            case 2:
                SaleInterface();
                break;
            case 3:
                RegisterPurchaseInterface();
                break;
            case 4:
                RegisterSaleInterface();
                break;
            case 5:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("opcion no valida");
                StartStore();
                break;
        }
    }
    public void BuyInterface(){
        newGui.ShowBuyMenu();
        System.out.print("ingrese una opcion: \n");
        int option = key.nextInt();
        switch (option){
            case 1://chom
                BuyMethod(1);
                break;
            case 2://rellenitas
                BuyMethod(2);
                break;
            case 3://inka-cola
                BuyMethod(3);
                break;
            case 4://coca-cola
                BuyMethod(4);
                break;
            case 5:
                System.out.println("Saliendo del programa");
                StartStore();
                break;
            default:
                System.out.println("opcion no valida");
                BuyInterface();
                break;
        }
    }
    public void BuyMethod(int option){
        newGui.ShowDetailProduct();
        if (option == 1 || option == 2){
            Cookie mycookie = (Cookie) newRegister.newStorage.FindProduct(option);
            System.out.println("|1\t|  "+mycookie.getNameProduct() +" - "+ mycookie.getFlavour()+"\t\t|  "+mycookie.getQuantity()+"\t|  "+String.format("%.2f", mycookie.getPurchasePrice())+"\t|");
        }else if(option == 3 || option == 4){
            Soda mySoda = (Soda) newRegister.newStorage.FindProduct(option);
            System.out.println("|1\t|  "+mySoda.getNameProduct() +" - "+ mySoda.getLitters()+" litros \t\t|  "+mySoda.getQuantity()+"\t|  "+String.format("%.2f", mySoda.getPurchasePrice())+"\t|");
        }
        System.out.print("Presione 1 para comprar y 2 para Regresar:");
        int optionTwo = key.nextInt();
        if(optionTwo == 1){
            System.out.print("Ingrese la cantidad que desea comprar: ");
            int quantity = key.nextInt();
            newRegister.BuyProduct(option, quantity);
            System.out.println("Gracias por comprar");
            BuyInterface();
        }else{
            BuyInterface();
        }
    }
    public void SaleInterface(){
        newGui.ShowSaleMenu();
        System.out.print("ingrese una opcion: \n");
        int option = key.nextInt();
        switch (option){
            case 1://chom
                SaleMethod(1);
                break;
            case 2://rellenitas
                SaleMethod(2);
                break;
            case 3://inka-cola
                SaleMethod(3);
                break;
            case 4://coca-cola
                SaleMethod(4);
                break;
            case 5:
                System.out.println("Saliendo del programa");
                StartStore();
                break;
            default:
                System.out.println("opcion no valida");
                SaleInterface();
                break;
        }
    }
    public void SaleMethod(int option){
        newGui.ShowDetailProduct();
        if (option == 1 || option == 2){
            Cookie mycookie = (Cookie) newRegister.newStorage.FindProduct(option);
            System.out.println("|1\t|  "+mycookie.getNameProduct() +" - "+ mycookie.getFlavour()+"\t\t|  "+mycookie.getQuantity()+"\t|  "+String.format("%.2f", mycookie.getSellingPrice())+"\t|");
        }else if(option == 3 || option == 4){
            Soda mySoda = (Soda) newRegister.newStorage.FindProduct(option);
            System.out.println("|1\t|  "+mySoda.getNameProduct() +" - "+ mySoda.getLitters()+" litros \t\t|  "+mySoda.getQuantity()+"\t|  "+String.format("%.2f", mySoda.getSellingPrice())+"\t|");
        }
        System.out.print("Presione 1 para vender y 2 para Regresar:");
        int optionTwo = key.nextInt();
        if(optionTwo == 1){
            System.out.print("Ingrese la cantidad que va vender: ");
            int quantity = key.nextInt();
            newRegister.SellProduct(option, quantity);
            System.out.println("Gracias por comprar");
            SaleInterface();
        }else{
            SaleInterface();
        }
    }
    public void RegisterPurchaseInterface(){
        ArrayList<Invoice> myList = newRegister.GetAllPurchaseInvoice();
        newGui.ShowPurchases();
        if (myList != null){
            for (Invoice item: myList) {
                System.out.println("|"+item.getTypeInvoice()+"\t|  "+item.getNameProduct()+"\t\t|  "+item.getQuantity()+"\t|  "+String.format("%.2f",item.getTotalPrice())+"\t|");
            }
            System.out.println("------------------------------------------------------");
            System.out.println("Presione cualquier tecla para salir");
            String option = key.next();
            if(option != ""){
                StartStore();
            }

        }else{
            System.out.println("Aun no hay compras registradas");
            StartStore();
        }
    }
    public void RegisterSaleInterface(){
        ArrayList<Invoice> myList = newRegister.GetAllSellInvoice();
        newGui.ShowPurchases();
        if (myList != null){
            for (Invoice item: myList) {
                System.out.println("|"+item.getTypeInvoice()+"\t|  "+item.getNameProduct()+"\t\t|  "+item.getQuantity()+"\t|  "+String.format("%.2f",item.getTotalPrice())+"\t|");
            }
            System.out.println("------------------------------------------------------");
            System.out.println("Presione cualquier tecla para salir");
            String option = key.next();
            if(option != ""){
                StartStore();
            }

        }else{
            System.out.println("Aun no hay compras registradas");
            StartStore();
        }
    }
}
