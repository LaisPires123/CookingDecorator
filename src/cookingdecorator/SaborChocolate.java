package cookingdecorator;

public class SaborChocolate extends Bolo {

    public SaborChocolate() {

        this.setNome("Chocolate");
    }

    @Override
    public String getAdcionais() {

        return "Massa + Chocolate\n";
    }

    @Override
    public double getValor() {

        return 6.0;
    }

}
