package classes.infraestructuras;

import classes.animales.Animal;
import interfaces.Dispositivo;

public class Vacunatorio implements Dispositivo {

    public Vacunatorio (){
        vacunas = 50;
    }

    private Integer vacunas;

    @Override
    public boolean puedeAtender(Animal animal) {
        return (animal.necesitaVacunarse() && vacunas > 0);
    }

    @Override
    public void atender(Animal animal) {
        if(puedeAtender(animal)){
            animal.serVacunado();
            vacunas --;
        }
    }

    @Override
    public boolean necesitaRecargar() {
        return (vacunas == 0); //si no tiene vacunas entonces necesita recargar
    }

    @Override
    public void recargar() {
        if(necesitaRecargar())
            vacunas = 50;
    }
}
