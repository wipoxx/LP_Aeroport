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
        if (nbTours < 5) {
            this.nbTours++;
        } else {
            this.avionAtterri = null;
        }
    }

    public void setAvionAtterri(Avion avion) throws EcrasementException {
        if (this.avionAtterri == null) {
            this.avionAtterri = avion;
        } else {
            throw new EcrasementException();
        }
    }
}
