package cookingdecorator;

public class FMorango extends Fruta {

    public FMorango(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return this.getBolo().getAdcionais() + "Adicionando fruta: Morango\n" ;
    }

    @Override
    public double getValor() {

        return 2.50 + this.getBolo().getValor();
    }

}
