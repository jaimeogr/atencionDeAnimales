package classes.infraestructuras;

import classes.animales.Animal;
import interfaces.Dispositivo;

public class EstacionDeServicio implements Dispositivo {

    public EstacionDeServicio (Dispositivo[] dispositivos ){// TODO: poner try catch para que dispositivos sea de length = 3
        this.dispositivos = dispositivos;
    }


    private Dispositivo[] dispositivos;

    @Override
    public boolean puedeAtender(Animal animal) {
        boolean sePuedeAtender = false;
        for(Dispositivo dispositivo: dispositivos ){
            if(dispositivo.puedeAtender(animal)){
                return true; //si llega aca es porque en algun dispositivo puede ser atendido y eso ya es suficiente
            }
        }
        return false;
    }

    @Override
    public void atender(Animal animal) {  //TODO: es correcto aca no poner un if de control? porque ya puse el control dentro de la logica de los dispositivos
        for(Dispositivo dispositivo: dispositivos ){
            dispositivo.atender(animal);
        }
    }

    @Override
    public boolean necesitaRecargar() {
        for(Dispositivo dispositivo: dispositivos ){
            if(dispositivo.necesitaRecargar())
                return true; //si llega aca es porque en algun dispositivo necesita recargarse y eso ya es suficiente
        }
        return false;
    }

    @Override
    public void recargar() {
        for(Dispositivo dispositivo: dispositivos ){
            dispositivo.recargar();
        }
    }
}
