package classes.infraestructuras;

import classes.animales.Animal;
import interfaces.Dispositivo;

public class Bebedero implements Dispositivo {

    public Bebedero (){
        animalesAtendidosDesdeRecarga = 0;
    }

    private Integer animalesAtendidosDesdeRecarga;

    @Override
    public boolean puedeAtender(Animal animal) {
        return animal.getTieneSed();
    }

    @Override
    public void atender(Animal animal) {
        if(puedeAtender(animal))
            animal.beber();
    }

    @Override
    public boolean necesitaRecargar() {
        if(animalesAtendidosDesdeRecarga >= 20)
            return true;
        return false;
    }

    @Override
    public void recargar() {
        if(necesitaRecargar()){
            animalesAtendidosDesdeRecarga = 0;
        }
    }
}
