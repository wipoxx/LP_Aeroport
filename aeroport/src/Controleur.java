import java.util.Scanner;

public class Controleur {
    private static final Aeroport aeroport = new Aeroport();

    public static void main(String[] args) {
        boolean quitter = false;
        Scanner entree = new Scanner(System.in);
        Ciel c = new Ciel(aeroport);
        c.start();
        while (quitter != true) {

            afficherAvionsetPistes();
            afficherMenu();
            quitter = demanderChoix(entree) == 0;
        }
    }

    private static void afficherMenu() {
        System.out.println("**************************************\n" +
                "1) Faire survoler les avions\n" +
                "2) Faire atterir un avion\n" +
                "0) Fin de la journée de travail !\n" +
                "**************************************");
    }

    private static void afficherAvionsetPistes() {
        System.out.println("**************************************");
        aeroport.afficherAvions();
        System.out.println("**************************************");
    }

    private static int demanderChoix(Scanner scanner) {
        System.out.println("Votre choix ?");
        int choix1 = scanner.nextInt();
        int res = -1;
        switch (choix1) {
            case 1:
                aeroport.faireSurvolerAvion();
                break;

            case 2:
                System.out.println("N° de série de l'avion : ");
                int numSerie = scanner.nextInt();
                System.out.println("N° de la piste : ");
                int piste = scanner.nextInt();

                try {
                    aeroport.faireAtterirAvion(numSerie, piste);
                } catch (EcrasementException ecrasementExc) {
                    ecrasementExc.getMessage();
                }
                break;

            case 0:
                res = 0;
                break;
            default:
                System.out.println("Veuillez entrer une valeur entre 0 et 2.");
                break;
        }
        return res;
    }
}
