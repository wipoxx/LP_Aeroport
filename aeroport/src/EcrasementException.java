public class EcrasementException extends Exception {
    private String avionCrash;

    public EcrasementException(String message) {
        super(message);
        this.avionCrash = message;
    }

    @Override
    public String getMessage() {
        return "L'avion " +this.avionCrash+ " s'est écrasé !";
    }
}
