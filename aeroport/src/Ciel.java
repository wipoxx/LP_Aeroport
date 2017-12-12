import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ciel extends Thread {
    private Avion avion;
    private ILieuAtterrissage piste;

    public Ciel(ILieuAtterrissage aeroport) {
        piste = aeroport;
    }

    @Override
    public void run() {
        while (piste != null) {
            int numAvion = (int) (Math.random() * 3) + 1;
            try {
                String nom = "";
                switch (numAvion) {
                    case 1: {
                        nom = AvionTypeA.class.getName();
                        break;
                    }
                    case 2: {
                        nom = AvionTypeB.class.getName();
                        break;
                    }
                    case 3: {
                        nom = AvionTypeC.class.getName();
                        break;
                    }
                }
                Class avion = Class.forName(nom);
                Constructor contruct = avion.getConstructor();
                Avion avionFinal = (Avion) contruct.newInstance();
                piste.survoler(avionFinal);
                Thread.sleep(5000);
            } catch (SecurityException e) {
                e.printStackTrace();

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                this.stop();
                e.printStackTrace();
            }
        }
    }
}
