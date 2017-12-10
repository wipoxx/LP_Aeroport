public abstract class Avion {

    private int essence;
    private String typeAvion;
    private int numSerie;

    public Avion(int qteEssence, String type, int numSerie) {
        typeAvion = type;
        essence = qteEssence;
        this.numSerie = numSerie;
    }

    public int getEssence() {
        return essence;
    }

    public String getTypeAvion() {
        return typeAvion;
    }

    public int getNumSerie() {
        return numSerie;
    }

    //Ajouter le toString de type  (NS:5, ESS:7) Super JET UQAC
}
