import java.io.Serializable;

public abstract class Veiculo implements Serializable {
    private String marca;
    private String modelo;
    private int ano;
    private int quilometragem;
    private boolean ligado;
    private String tipo;

    public Veiculo(String marca, String modelo, int ano, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.setLigado(false);
    }

    public String toString() {

        String v = "";
        v += " Marca: " + this.getMarca() + "\n";
        v += " Modelo: " + this.getModelo() + "\n";
        v += " Ano: " + this.getAno() + "\n" ;
        v += " Quilometragem : " + this.getQuilometragem() + "\n";
        v += " Ligado: " + this.getLigado() + "\n";
        v += " Combustivel: " + this.abastecer(45) + "\n";
        return v;
    }

    // Getter && Setter
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getLigado() {
        return ligado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String abastecer(int volume) {
        return "Abastecido com " + volume + " litros";
    }
}
