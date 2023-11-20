import product.*;
import storage.Storage;

public class Main {
    public static void main(String[] args) {
        Cookie chom = new Cookie("Galleta Chom", 5.5f, 8, "naranja");
        Cookie rellenita = new Cookie("Galleta Rellenita", 1.5f, 15, "chocolate");
        Cookie picaras = new Cookie("Galleta Picaras", 4.3f, 10, "fresa");

        Storage newStorage = new Storage();
        newStorage.SaveProduct(chom);
        newStorage.SaveProduct(rellenita);
        newStorage.SaveProduct(picaras);
        Cookie cookie = (Cookie) newStorage.FindProduct(3);
        System.out.println(cookie.getFlavour());
    }
}