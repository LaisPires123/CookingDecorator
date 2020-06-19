package cookingdecorator;

public class CMorango extends Cobertura {

    public CMorango(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return  this.getBolo().getAdcionais() + "Adicionando cobertura: Morango\n" ;
    }

    @Override
    public double getValor() {

        return 2.0 + this.getBolo().getValor();
    }

}
