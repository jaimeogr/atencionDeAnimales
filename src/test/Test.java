package test;

import classes.animales.Animal;
import classes.animales.Cerdo;
import classes.animales.Gallina;
import classes.animales.Vaca;
import classes.infraestructuras.*;
import interfaces.Dispositivo;

import java.util.ArrayList;

public class Test {

    private ArrayList<EstacionDeServicio> estaciones = new ArrayList<EstacionDeServicio>(); //TODO: por que no puedo usar el add cuando estoy adentro del main? (screenshotSSS).
    private ArrayList<Animal> animales = new ArrayList<Animal>();
    private Dispositivo[] dispositivos1 = {new ComedorInteligente(30000), new Bebedero(), new Vacunatorio()}; //TODO: es buena practica esta forma de inicializar todo?
    private Dispositivo[] dispositivos2 = {new ComederoNormal(20000, 5, 200), new Bebedero(), new Vacunatorio()};
    private Dispositivo[] dispositivos3 = {new ComedorInteligente(20000), new Bebedero(), new Vacunatorio()};



    public void execute (){
        fillData();
        for(Animal animal: animales){
            for(EstacionDeServicio estacion : estaciones){
                if(estacion.puedeAtender(animal))
                    estacion.atender(animal);
            }
        }
        for (EstacionDeServicio estacion : estaciones){
            if (estacion.necesitaRecargar())
                estacion.recargar();
        }

    }

    private void fillData (){

        estaciones.add(new EstacionDeServicio(dispositivos1));

        estaciones.add(new EstacionDeServicio(dispositivos2));

        estaciones.add(new EstacionDeServicio(dispositivos3));

        Vaca lechera = new Vaca(1000);
        Cerdo benji = new Cerdo(1000);
        Gallina cocoroco = new Gallina();

        animales.add(lechera);
        animales.add(benji);
        animales.add(cocoroco);


    }
}
