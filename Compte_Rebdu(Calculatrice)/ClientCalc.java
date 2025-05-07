import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientCalc {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(); // Par défaut "localhost" et port 1099
            Calculatrice calc = (Calculatrice) registry.lookup("CalculatriceService");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le premier nombre : ");
            double a = scanner.nextDouble();

            System.out.print("Entrez le deuxième nombre : ");
            double b = scanner.nextDouble();

            System.out.println("Choisissez l'opération : + - * /");
            String op = scanner.next();

            double resultat = 0;
            switch (op) {
                case "+":
                    resultat = calc.addition(a, b);
                    break;
                case "-":
                    resultat = calc.soustraction(a, b);
                    break;
                case "*":
                    resultat = calc.multiplication(a, b);
                    break;
                case "/":
                    resultat = calc.division(a, b);
                    break;
                default:
                    System.out.println("Opération invalide.");
                    System.exit(0);
            }

            System.out.println("Résultat : " + resultat);
        } catch (Exception e) {
            System.out.println("Erreur côté client :");
            e.printStackTrace();
        }
    }
}
