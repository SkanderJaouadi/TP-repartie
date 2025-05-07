import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class ClientBanque {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            CompteInterface compte = (CompteInterface) registry.lookup("CompteBancaire");

            // Test operations
            compte.verser(100);
            System.out.println("Solde après versement: " + compte.getSolde());

            compte.retirer(50);
            System.out.println("Solde après retrait: " + compte.getSolde());

            System.out.println("Découvert autorisé: " + compte.getDecouvert());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}