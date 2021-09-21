package calculos.de.salarios;

import java.util.Scanner;

/**
 *
 * @author Alberto tonela
 */
public class Menu {
    Scanner tec = new Scanner(System.in);
    String nome,tipo;
    int codigo,nrVendas,anosTrabalho, escolha;
    double subRisco,salario,subAlimentacao;
    private Gestor[] G = new Gestor[2];
    private Caixa [] C = new Caixa[2];
    public void Menu(){
        do{
            System.out.println("ECOLHA A OPCAO QUE ESEIJA "); 
            System.out.println("1.CRIAR GESTOR");
            System.out.println("2.CRIAR CAIXA ");
            System.out.println("3. CRIAR FUNVIONARIO");
            System.out.println(" 4. SAIR");
            escolha = tec.nextInt();
            switch(escolha){
                case 1:
                    for(int  i = 0 ; i<G.length ;i++){
                    System.out.println("GESTOR");
                        System.out.println(" digite o nome ");
                        nome = tec.next();
                        System.out.println("digite o codigo ");
                        codigo = tec.nextInt();
                        System.out.println(" digite o tipo ");
                        
                        tipo = tec.next();
                        System.out.println("digite o salario ");
                        salario = tec.nextDouble();
                        System.out.println("digite anos de trabalho ");
                        anosTrabalho = tec.nextInt();
                        System.out.println(" digite subsidio de alimentacao  ");
                        subAlimentacao = tec.nextDouble();
                        G[i] = new Gestor(subAlimentacao ,tipo,nome,codigo);
                        G[i].calculaReforma(salario, anosTrabalho);
                        break;
                        
                }
                case 2:
                    for(int j = 0 ; j<C.length ; j++){
                        System.out.println("caixa ");
                        System.out.println("digite o nome ");
                        nome = tec.next();
                        System.out.println("digite o codigo ");
                         codigo = tec.nextInt();
                         System.out.println("digite o salario ");
                         salario = tec.nextDouble();
                         System.out.println(" digite anos de trabalho ");
                         anosTrabalho = tec.nextInt();
                         System.out.println(" digite  o numero d vendas diarias ");
                         nrVendas = tec.nextInt();
                         System.out.println(" digite   o subsidio de riscos ");
                         subRisco= tec.nextDouble();
                         System.out.println("");
                         C[j] = new Caixa (subRisco,nrVendas,nome, codigo);
                         C[j].calculaReforma(salario, anosTrabalho);
                         break;
                    }
                case 3:
                    
                    System.out.println("gestor ");
                    for(int i =0 ; i<G.length ; i++){
                        System.out.println(G[i].toString()+"reforma : "+G[i].calculaReforma(salario, anosTrabalho));
                        System.out.println("");
                    }
                    System.out.println("Caixa ");
                    for( int j= 0 ; j<C.length ; j++){
                        System.out.println(C[j].toString()+" reforma :"+G[j].calculaReforma(salario, anosTrabalho));
                        System.out.println("");
                        
                        break;
                    }
                case 4:
                    System.exit(0);
                default:
                    System.out.println(" opcao invalida ");
                    break;
                            
            }
        } while(escolha !=4);
    }
    
}
