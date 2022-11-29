package entities;


import java.util.Locale;
import java.util.Scanner;


public class VectorExercices {
    private int count;
    private int[] vector;
    
    Scanner sc = new Scanner(System.in);
    
    public void getVectorNeg() { 
        
         System.out.print("Quantos numeros voce vai digitar? ");
         this.count  = sc.nextInt();
         
         this.vector = new int[count];
         
         for (int i=0; i<count; i++) {
            System.out.print("Digite um numero: ");
            this.vector[i] = sc.nextInt();
        }
        System.out.println("NEGAGTIVE NUMBERS:");

         for (int i=0; i<count; i++) {
             if ( this.vector[i] < 0) {
                System.out.printf("%d\n",  this.vector[i]);
            }
        }

        sc.close();
    }
    
    public void getHeight() {
        
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n, nmenores;
            double alturatotal, alturamedia, percentualMenores;

            System.out.print("Quantas pessoas serao digitadas? ");
            n = sc.nextInt();

            String[] nomes = new String[n];
            int[] idades = new int[n];
            double[] alturas = new double[n];

            for (int i=0; i<n; i++) {
                System.out.printf("Dados da %da pessoa:\n", i + 1);
                System.out.print("Nome: ");
                nomes[i] = sc.next();
                System.out.print("Idade: ");
                idades[i] = sc.nextInt();
                System.out.print("Altura: ");
                alturas[i] = sc.nextDouble();
            }

                nmenores = 0;
                alturatotal = 0;
            for (int i=0; i<n; i++) {
                if (idades[i] < 16) {
                    nmenores++;
                }
                alturatotal = alturatotal + alturas[i];
            }

            alturamedia = alturatotal / n;
            percentualMenores = ((double)nmenores / n) * 100.0;

            System.out.printf("\nAltura media = %.2f\n", alturamedia);
            System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

            for(int i=0; i<n; i++) {
                if (idades[i] < 16) {
                        System.out.printf("%s\n", nomes[i]);
                }
           }

          sc.close();
    }
}
