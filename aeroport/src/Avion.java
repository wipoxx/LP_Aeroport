public abstract class Avion {

    private int essence;
    private String typeAvion;
    private int numSerie = 0;

    protected static int compteur = 0;
    public Avion(int qteEssence, String type, int numSerie) {
        typeAvion = type;
        essence = qteEssence;
        this.numSerie = numSerie;
        this.compteur++;
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
    @Override
    public String toString(){
        return "(NS:"+numSerie+", ESS:"+essence+") "+typeAvion;
    }
}
