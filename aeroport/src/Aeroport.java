import java.util.ArrayList;

public class Aeroport implements ITourControle, ILieuAtterrissage {
    private ArrayList<Piste> lPistes = new ArrayList<>();
    private ArrayList<Avion> lAvionsCiel = new ArrayList<>();

    public Aeroport() {
        this.lPistes = lPistes;
    }

    @Override
    public void afficherAvions() {

    }

    @Override
    public void faireAtterirAvion(int numSerie, int numPiste) throws EcrasementException {

    }

    @Override
    public void faireSurvolerAvion() {

    }

    public void setlAvionsCiel(ArrayList<Avion> lAvionsCiel) {
        this.lAvionsCiel = lAvionsCiel;
    }
}
