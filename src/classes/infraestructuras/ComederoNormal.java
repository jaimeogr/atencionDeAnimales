package classes.infraestructuras;

import classes.animales.Animal;
import interfaces.Dispositivo;

public class ComederoNormal implements Dispositivo {

    public ComederoNormal (Integer pesoSoportado, Integer raciones, Integer pesoPorRacion){
        this.pesoSoportado = pesoSoportado;
        this.raciones = raciones;
        this.pesoPorRacion = pesoPorRacion;
    }

    private Integer pesoSoportado, raciones, pesoPorRacion;

    @Override
    public boolean puedeAtender(Animal animal) {
        boolean puedeSerAtendido = false;
        if(animal.getPeso() < pesoSoportado && animal.getTieneHambre() && raciones > 1)
            puedeSerAtendido = true;
        return puedeSerAtendido;
    }

    @Override
    public void atender(Animal animal) {
        if(puedeAtender(animal))
            animal.comer(pesoPorRacion);
    }

    @Override
    public boolean necesitaRecargar() {
        if (raciones < 10)
            return true;
        else
            return false;
    }

    @Override
    public void recargar() {
        if (necesitaRecargar())
            raciones += 30;
    }
}
