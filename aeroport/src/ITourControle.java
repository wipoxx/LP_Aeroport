public interface ITourControle {
    public void afficherAvions();

    public void faireAtterirAvion(int numSerie, int numPiste) throws EcrasementException;

    public void faireSurvolerAvion();
}
