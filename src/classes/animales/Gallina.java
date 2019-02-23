package classes.animales;

public class Gallina extends Animal {
    public Gallina() {
        this.peso = 4000;
        this.tieneSed = false;
        this.vecesQueComio = 0;
    }

    private Integer vecesQueComio;

    @Override
    public void comer(Integer comidaGramos) {
        vecesQueComio ++;
    }

    @Override
    public void beber() {

    }

    @Override
    public boolean getTieneHambre() {
        return true;
    }

    @Override
    public boolean necesitaVacunarse() {
        return false;
    }

    @Override
    public void serVacunado() {

    }

}
