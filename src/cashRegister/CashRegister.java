package cashRegister;

public class CashRegister {
    //comprar items
    public String BuyProduct(int index){
        String message="";
        switch (index){
            case 1:
                message = "comprando galleta chom";
                break;
            case 2:
                message = "comprando galleta rellenita";
                break;
            case 3:
                message = "comprando gaseosa inkacola";
                break;
            case 4:
                message = "comprando gaseosa cocacola";
                break;
            default:
                message = "opcion invalida";
                break;
        }
        return message;
    }
    //vender items
    public String SellProduct(int index){
        String message="";
        switch (index){
            case 1:
                message = "vendiendo galleta chom";
                break;
            case 2:
                message = "vendiendo galleta rellenita";
                break;
            case 3:
                message = "vendiendo gaseosa inkacola";
                break;
            case 4:
                message = "vendiendo gaseosa cocacola";
                break;
            default:
                message = "opcion invalida";
                break;
        }
        return message;
    }
    //registrar compras de productos
    //registrar ventas

}
