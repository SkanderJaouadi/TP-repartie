import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServeurCalc extends UnicastRemoteObject implements Calculatrice {
    public ServeurCalc() throws RemoteException {
        super();
    }
    @Override
    public double addition(double a, double b) {
        return a + b;
    }
    @Override
    public double soustraction(double a, double b) {
        return a - b;
    }
@Override
    public double multiplication(double a, double b) {
        return a * b;
    }
    @Override
    public double division(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division par zéro !");
        return a / b;
    }
}
