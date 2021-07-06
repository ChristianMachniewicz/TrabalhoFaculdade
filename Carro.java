public class Carro extends Veiculo {
	private static final long serialVersionUID = 1L;
    private int portas;

    public void desligarVeiculo() {
    };

    public Carro(String marca, String modelo, int ano, int quilometragem, int portas) {
        super(marca, modelo, ano, quilometragem);
        this.setTipo(" Carro ");
        this.portas = portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public String abastecer(int volume) {
        return super.abastecer(volume) + " de Gasolina.";
    }
}

