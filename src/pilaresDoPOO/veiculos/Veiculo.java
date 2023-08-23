package pilaresDoPOO.veiculos;

public abstract class Veiculo {
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract void ligar();
}
