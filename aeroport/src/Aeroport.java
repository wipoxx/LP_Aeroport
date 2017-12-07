import java.util.ArrayList;

public class Aeroport implements ITourControle, ILieuAtterrissage {
    private ArrayList<Piste> lPistes = new ArrayList<>();
    private ArrayList<Avion> lAvionsCiel = new ArrayList<>();

    public Aeroport() {
        for (int i = 1; i < 4; i++) {
            this.lPistes.add(new Piste(i));
        }
    }

    @Override
    public void afficherAvions() {
        String res = "Avions en survol : \n";
        for (Avion avion : this.lAvionsCiel) {
            res += avion + "\n";
        }

        res += "Etat des pistes\n";

        for (Piste piste : this.lPistes) {
            res += piste + "\n";
        }

        System.out.println(res);
    }

    @Override
    public void faireAtterirAvion(int numeroSerie, int numPiste) throws EcrasementException {
        if (1 <= numPiste && numPiste <= 3) {
            this.lPistes.get(numPiste).setAvionAtterri(lAvionsCiel.get(numeroSerie));
        }
    }

    @Override
    public void faireSurvolerAvion() {
        for (Piste piste : this.lPistes) {
            piste.passerTour();
        }
    }

    public void setlAvionsCiel(ArrayList<Avion> lAvionsCiel) {
        this.lAvionsCiel = lAvionsCiel;
    }

    @Override
    public void survoler(Avion a) {
        lAvionsCiel.add(a.getNumSerie(), a);
    }
}
