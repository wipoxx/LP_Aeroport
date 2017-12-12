public interface ITourControle {
    public void afficherAvions();

    public void faireAtterirAvion(int numeroSerie, int numPiste) throws EcrasementException;

    public void faireSurvolerAvion() throws EcrasementException;
}
