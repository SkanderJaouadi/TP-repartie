
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client{
    public static void main(String[] args) throws RemoteException{
        if (args.length < 1) {
            System.out.println("Usage: java Client <host>");
            return;
        }
        try {
             Registry re = LocateRegistry.getRegistry(args[0]);   
            IRemote ro=(IRemote) re.lookup("rr");
            String s=ro.Rmi();
            System.out.println(s);   
        } catch (NotBoundException e) {
            System.err.println("error");
        }
         
    }
}