package cookingdecorator;

public class SaborLaranja extends Bolo {

    public SaborLaranja() {

        this.setNome("Laranja");
    }

    @Override
    public String getAdcionais() {

        return "Massa + Laranja\n";
    }

    @Override
    public double getValor() {

        return 5.0;
    }

}
