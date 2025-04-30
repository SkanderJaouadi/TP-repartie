
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Remoteobject extends UnicastRemoteObject implements IRemote{
    public Remoteobject() throws RemoteException{};
    @Override
    public String Rmi() throws RemoteException {
        return "TP RMI";
    }
    
    public void main(String[] args) throws  RemoteException{
        IRemote ro = new Remoteobject();

        Registry r=LocateRegistry.getRegistry();
        r.rebind("rr", ro);

    }
}