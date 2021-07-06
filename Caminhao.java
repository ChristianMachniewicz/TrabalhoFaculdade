public class Caminhao extends Veiculo {
    private static final long serialVersionUID = 1L;
    private int assentos;
    private int portas;

    public Caminhao(String marca, String modelo, int ano, int quilometragem, int portas, int assentos) {
        super(marca, modelo, ano, quilometragem);
        this.assentos = assentos;
        this.portas = portas;
        this.setTipo(" Caminhao ");
    }

    public void carregarMudanca() {

    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String abastecer(int volume) {
        return super.abastecer(volume) + " de Diesel.";
    }
}
