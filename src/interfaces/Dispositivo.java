package interfaces;

import classes.animales.Animal;

public interface Dispositivo {

    public abstract boolean puedeAtender (Animal animal);

    public abstract void atender (Animal animal);

    public abstract boolean necesitaRecargar ();

    public abstract void recargar();
}
