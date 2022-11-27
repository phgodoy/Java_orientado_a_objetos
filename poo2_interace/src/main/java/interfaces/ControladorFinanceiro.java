
package interfaces;

import classes.Movimento;


public interface ControladorFinanceiro {
    Boolean addMovimento(Movimento movimenrto); 
    
    Boolean delMovimento(Movimento movimenrto);
    
    Movimento getMovimentoById(Long Id);
    
    Movimento getAllMovimento();
    
    void getSaldo();
}
