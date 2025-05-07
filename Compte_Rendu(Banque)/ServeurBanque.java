
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author mag
 */
public class ServeurBanque {
    public static void main(String[] args) {
        try {
            CompteImpl compte = new CompteImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CompteBancaire", compte);
            System.out.println("Serveur prêt.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}