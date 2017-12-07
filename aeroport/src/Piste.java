public class Piste {
    private int numPiste;
    private Avion avionAtterri;
    private int nbTours;

    public Piste(int numPiste) {
        this.numPiste = numPiste;
        this.nbTours = 0;
        this.avionAtterri = null;
    }

    public void passerTour() {
        if (this.avionAtterri != null) {
            if (nbTours < 5) {
                this.nbTours++;
            } else {
                this.avionAtterri = null;
            }
        }

    }

    public void setAvionAtterri(Avion avion) throws EcrasementException {
        if (this.avionAtterri == null) {
            this.avionAtterri = avion;
        } else {
            throw new EcrasementException();
        }
    }

    @Override
    public String toString() {
        String res = "(" + this.numPiste + ") ";
        if (this.avionAtterri == null) {
            res += "Libre";
        } else {
            res += "Occupée : " +
                    "(NS:" + this.avionAtterri.getNumSerie() + ", ESS:" + this.avionAtterri.getEssence() + ") " +
                    "(" + this.nbTours + "/5 tours)";
        }

        return res;
    }
}
