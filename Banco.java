/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Thiago
 */
public class  Banco {
       // Declaracao dos atributos
     private double Caixa = 0;
     private String Nome;

      // Declaracao dos metodos
      public void dep(double Quantia)  
      {
          this.Caixa = this.Caixa + Quantia + (Quantia*0.30);
      }
        public double getCaixa()
        {
            return this.Caixa;
        }
         public void setNome(String N)
         {
             this.Nome = N;
         }     
         public String getNome()
         {
             return this.Nome;
         }
    public static void main(String[] args)
    {
        // TODO code application logic her
        //  Selecao das contas
        Conta client1 = new Conta();
        Conta client2 = new Conta();
        Conta client3 = new Conta();
        Conta client4 = new Conta();
        // Nome dos clientes cadastrados
        client1.setNome( "Cliente 1" );
        client2.setNome( "Cliente 2" );
        client3.setNome( "Cliente 3" );
        client4.setNome( "Cliente 4" );
        // Somar valores nas contas
        client1.dep (20);
        client2.dep (30);
        client3.dep (40);
        client4.dep (50);
        //Executando o programa na tela
        System.out.println( "** CAIXA REGISTRADORA - BANCO  ESTACIO **\n*\t\t\t\t\t*" );
        System.out.println( "* Cliente \t\t\t\t*");
        System.out.println( "* Nome: " + client1.getNome() + "\t\t\t*");
        System.out.println( "* Caixa: "+client1.getCaixa() + "\t\t\t\t*\n*\t\t\t\t\t*");
        System.out.println( "* Nome: "+client2.getNome() + "\t\t\t*");
        System.out.println( "* Caixa: "+client2.getCaixa() + "\t\t\t\t*\n*\t\t\t\t\t*");
        System.out.println( "* Nome: "+client3.getNome() + "\t\t\t*");
        System.out.println( "* Caixa: "+client3.getCaixa() + "\t\t\t\t*\n*\t\t\t\t\t*"); 
        System.out.println( "* Nome: "+client4.getNome() + "\t\t\t*");
        System.out.println( "* Caixa: "+client4.getCaixa() + "\t\t\t\t*\n*****************************************");
        System.out.println("--> Obrigado por utilizar o nosso sistema <--\n");
    }
}
