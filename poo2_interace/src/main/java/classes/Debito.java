
package classes;

import java.util.Date;

public class Debito extends Movimento{
    private String fornecedor;
    private Date dtVencimento;
    
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
    public Movimento getMovimentoById(Long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Movimento getAllMovimento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean addMovimento(Movimento movimenrto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delMovimento(Movimento movimenrto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
