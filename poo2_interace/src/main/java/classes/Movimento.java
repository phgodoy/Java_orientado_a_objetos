
package classes;

import interfaces.ControladorFinanceiro;
import java.util.Date;

public abstract class Movimento implements ControladorFinanceiro {
    private Long id;
    private Date data;
    private Double valor;
    
    
    public abstract Boolean delMovimento();
    public abstract Boolean addMovimento();
}
