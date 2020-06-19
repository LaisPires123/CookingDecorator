package cookingdecorator;

public class InformaçãoBolo {

    public static void ResumoBolo(Bolo b) {

        System.out.println("Bolo: " + b.getNome());
        System.out.println("\nConfeito: " + b.getAdcionais());
        System.out.println("Valor: " + b.getValor());

    }

}
