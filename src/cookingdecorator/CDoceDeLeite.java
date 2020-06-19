/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookingdecorator;

/**
 *
 * @author Pessoal
 */
public class CDoceDeLeite extends Cobertura {

    public CDoceDeLeite(Bolo b) {
        super(b);
    }
    
    

    @Override
    public String getAdcionais() {
        
        return  this.getBolo().getAdcionais() + "Adicionando cobertura: Doce de leite\n";
   }

    @Override
    public double getValor() {
        
        return 1.50 + this.getBolo().getValor();
   }
    
}
