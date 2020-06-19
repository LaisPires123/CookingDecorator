package cookingdecorator;

public class FAmora extends Fruta {

    public FAmora(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return this.getBolo().getAdcionais() + "Adicionando fruta: Amora\n" ;
    }

    @Override
    public double getValor() {

        return 2.0 + this.getBolo().getValor();
    }

}
