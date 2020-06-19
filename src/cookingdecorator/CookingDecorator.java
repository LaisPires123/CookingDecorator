package cookingdecorator;

public class CookingDecorator {

    public static void main(String[] args) {

        Bolo bolo = new SaborChocolate();
        bolo = new CChocolate(bolo);
        bolo = new FAmora(bolo);
        InformaçãoBolo.ResumoBolo(bolo);

        System.out.println("----------");

        Bolo bolo2 = new SaborLimão();
        bolo2 = new FMorango(bolo2);
        InformaçãoBolo.ResumoBolo(bolo2);

        System.out.println("----------");
        
        Bolo bolo3 = new SaborBaunilha();
        bolo3 = new CMorango(bolo3);
        bolo3 = new FMorango(bolo3);
        InformaçãoBolo.ResumoBolo(bolo3);
        
         System.out.println("----------");
         
        Bolo bolo4 = new SaborLaranja();
        bolo4 = new CDoceDeLeite(bolo4);
        bolo4 = new FPêssego(bolo4);
        InformaçãoBolo.ResumoBolo(bolo4);

    }

}
