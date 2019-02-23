package classes.infraestructuras;

import classes.animales.Animal;
import interfaces.Dispositivo;

public class ComedorInteligente implements Dispositivo {

    public ComedorInteligente (Integer capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.alimentoRestante = capacidadMaxima;
    }

    private Integer capacidadMaxima, alimentoRestante;

    @Override
    public boolean puedeAtender(Animal animal) {
        boolean puedeSerAtendido = false;
        if (animal.getTieneHambre() && (animal.getPeso() / 100 ) < alimentoRestante )
            puedeSerAtendido = true;
        return puedeSerAtendido;
    }

    @Override
    public void atender(Animal animal) {
        Integer racion = animal.getPeso()/100;
        if(puedeAtender(animal)){
            animal.comer(racion);
            alimentoRestante -= racion;
        }
    }

    @Override
    public boolean necesitaRecargar() {
        if(alimentoRestante < 15000)
            return true;
        return false;
    }

    @Override
    public void recargar() {
        if(necesitaRecargar())
            alimentoRestante = capacidadMaxima;
    }
}
