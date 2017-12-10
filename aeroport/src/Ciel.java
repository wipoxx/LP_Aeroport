import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ciel extends Thread {
    private Avion avion;
    private  ILieuAtterrissage piste;

    public Ciel(){
        this.run();
    }

    @Override
    public void run() {
        int numAvion = (int) (Math.random() * 3) + 1;
        System.out.println(numAvion);
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
            Constructor contruct= avion.getConstructor();
            Object avionFinal = contruct.newInstance();
            System.out.println(avionFinal.toString());
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
        }
    }
}
