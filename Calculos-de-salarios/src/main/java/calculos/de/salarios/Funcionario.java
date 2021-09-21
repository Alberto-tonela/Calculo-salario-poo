package calculos.de.salarios;

/**
 *
 * @author Alberto tonela
 */
public class Funcionario {
    private String nome ;
    private int codigo;

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public double calculaReforma( double salario, int anosTrab){
        double reforma=(salario/anosTrab)*0.3;
        return reforma;
        
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", codigo=" + codigo + '}';
    }
    
    
}
