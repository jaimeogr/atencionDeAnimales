package classes.animales;

public class Cerdo extends Animal{

    private Integer mayorAlimentacionGramos = 0, comioSinBeberXVeces = 0;

    private boolean tieneHambre;

    public Cerdo(Integer peso) {
        super(peso);
        tieneHambre = true;
    }

    @Override
    public void comer(Integer comidaGramos) {
        comioSinBeberXVeces ++;
        if (comioSinBeberXVeces >= 3)
            tieneSed = true;
        if(comidaGramos > 200){
            this.peso += comidaGramos-200;
            if(comidaGramos > 1000)
                tieneHambre = false;
            if(comidaGramos > mayorAlimentacionGramos)
                mayorAlimentacionGramos = comidaGramos;
            return;
        }else{
            this.peso = this.peso - 200 + comidaGramos;
        }
    }

    @Override
    public void beber() {
        tieneSed = false;
        tieneHambre = true;
        comioSinBeberXVeces = 0;
    }

    @Override
    public boolean getTieneHambre() {
        return false;
    }

    @Override
    public boolean necesitaVacunarse() {
        return true;
    }

    public Integer getMayorAlimentacionGramos() {
        return mayorAlimentacionGramos;
    }

    @Override
    public void serVacunado() {
        estaVacunado = true;
    }

}
