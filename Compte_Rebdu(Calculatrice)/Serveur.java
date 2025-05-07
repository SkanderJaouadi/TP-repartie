import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099); // Port par défaut
            registry.rebind("CalculatriceService", new ServeurCalc());
            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
