package calculos.de.salarios;

/**
 *
 * @author Alberto tonela
 */
public class Caixa extends Funcionario{
    private  double subRisco;
    private  int nrVendas;

    public Caixa(double subRisco, int nrVendas, String nome, int codigo) {
        super(nome, codigo);
        this.subRisco = subRisco;
        this.nrVendas = nrVendas;
    }

    public double getSubRisco() {
        return subRisco;
    }

    public void setSubRisco(double subRisco) {
        this.subRisco = subRisco;
    }

    public int getNrVendas() {
        return nrVendas;
    }

    public void setNrVendas(int nrVendas) {
        this.nrVendas = nrVendas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Caixa{" + "subRisco=" + subRisco + ", nrVendas=" + nrVendas + '}';
    }
    
    
}
