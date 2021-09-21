
package calculos.de.salarios;

/**
 *
 * @author Alberto tonela
 */
public class Gestor extends Funcionario {
    private double subAlimentacao;
    private String tipo;

    public Gestor(double subAlimentacao, String tipo, String nome, int codigo) {
        super(nome, codigo);
        this.subAlimentacao = subAlimentacao;
        this.tipo = tipo;
    }

    public double getSubAlimentacao() {
        return subAlimentacao;
    }

    public void setSubAlimentacao(double subAlimentacao) {
        this.subAlimentacao = subAlimentacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Gestor{" + "subAlimentacao=" + subAlimentacao + ", tipo=" + tipo + '}';
    }
    
    
}
