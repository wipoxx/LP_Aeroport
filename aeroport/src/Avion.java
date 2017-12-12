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

    @Override
    public String toString(){
        return "(NS:"+numSerie+", ESS:"+essence+") "+typeAvion;
    }

    public void setEssence(int essence) throws EcrasementException {
        if (essence > 0) {
            this.essence = essence;
        } else {
            throw new EcrasementException(this.toString());
        }

    }
}
