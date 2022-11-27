package main.MeuControler;
import classes.Credito;
import classes.Debito;
import java.util.Scanner;

public class MeuControle {
    
    public static void main(String[] args) {

         Scanner menu = new Scanner (System.in);  
            //Credito credito = new Credito();
            //Debito  debito  = new Debito();
                  
            while (true) {            

            System.out.print("##--Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Funcionario chefe |\n");
            System.out.print("| Opção 2 - Funcionario comissionado|\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();
            
            switch (opcao) {
            case 1 -> {
                    
                 }

            case 2 -> {
                 }
                
            case 3 -> {
                System.out.print("\nAté logo!");
                menu.close();
                 }

            default -> System.out.print("\nOpção Inválida!");
        }
    }
 }

}
