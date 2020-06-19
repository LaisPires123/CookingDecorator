package cookingdecorator;

public class FPêssego extends Fruta {

    public FPêssego(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return this.getBolo().getAdcionais() + "Adicionando fruta: Pêssego\n" ;
    }

    @Override
    public double getValor() {

        return 1.50 + this.getBolo().getValor();
    }

}
