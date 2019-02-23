package classes.animales;

public abstract class Animal {

    public Animal(Integer peso){
        this.peso = peso;
        configuration();
    }

    public Animal(){
        configuration();
    }

    private void configuration() {
        tieneSed = true;
        estaVacunado = false;
    }

    protected Integer peso;

    protected boolean tieneSed;

    protected boolean estaVacunado;

    public abstract void comer(Integer comidaGramos);

    public abstract void beber();

    public abstract boolean getTieneHambre();

    public boolean getTieneSed(){
        return tieneSed;
    };

    public Integer getPeso() {
        return peso;
    }

    public abstract boolean necesitaVacunarse();

    public abstract void serVacunado();
}
