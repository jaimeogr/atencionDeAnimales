package classes.animales;

public class Vaca extends Animal {
    public Vaca(Integer peso) {
        super(peso);
    }

    @Override
    public void comer(Integer comidaGramos) {
        this.peso += comidaGramos/3;
        tieneSed = true;
    }

    @Override
    public void beber() {
        tieneSed = false;
        this.peso -= 500;
    }

    @Override
    public void serVacunado() {
        if(estaVacunado == false)
            estaVacunado = true;
    }


    public boolean getTieneHambre() {
        if(peso < 200000)
            return true;
        else
            return false;
    }

    @Override
    public boolean necesitaVacunarse() {
        return !estaVacunado;
    }

    public void caminar (){
        peso -= 3000;
    }
}
