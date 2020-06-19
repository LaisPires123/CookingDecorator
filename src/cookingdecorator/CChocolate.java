package cookingdecorator;

public class CChocolate extends Cobertura {

    public CChocolate(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return  this.getBolo().getAdcionais() + "Adicionando cobertura: Chocolate\n";
    }

    @Override
    public double getValor() {

        return 2.25 + this.getBolo().getValor();
    }

}
