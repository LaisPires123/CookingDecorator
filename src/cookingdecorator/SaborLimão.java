package cookingdecorator;

public class SaborLimão extends Bolo {

    public SaborLimão() {

        this.setNome("Limão");
    }

    @Override
    public String getAdcionais() {

        return "Massa + Limão\n";
    }

    @Override
    public double getValor() {

        return 5.0;
    }

}
