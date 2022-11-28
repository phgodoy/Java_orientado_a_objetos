
package classes;


public class Credito extends Movimento{
   
    private String descOrigem;
    private String referencia;
    
     @Override
    public Boolean delMovimento() {
         System.out.println("Movimento deletado");
         return true;
    }

    @Override
    public Boolean addMovimento() {
         System.out.println("Movimento adicionado");
         return true;
    }

    @Override
    public Boolean addMovimento(Movimento movimenrto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Boolean delMovimento(Movimento movimenrto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Movimento getMovimentoById(Long Id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Movimento getAllMovimento() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
