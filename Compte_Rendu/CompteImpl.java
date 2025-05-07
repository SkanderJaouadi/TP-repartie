import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CompteImpl extends UnicastRemoteObject implements CompteInterface {
    private float solde;
    private float decouvertAutorise;

    public CompteImpl() throws RemoteException {
        super();
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    @Override
    public float getSolde() throws RemoteException {
        return solde;
    }

    @Override
    public void verser(float mt) throws RemoteException {
        solde += mt;
    }

    @Override
    public void retirer(float mt) throws RemoteException {
        if (solde - mt >= -decouvertAutorise) {
            solde -= mt;
        } else {
            throw new RemoteException("Découvert dépassé !");
        }
    }

    @Override
    public float getDecouvert() throws RemoteException {
        return decouvertAutorise;
    }

}