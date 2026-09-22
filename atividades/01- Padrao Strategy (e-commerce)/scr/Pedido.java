import frete.CalculaFrete;

public class Pedido {

    private double peso;
    private CalculaFrete estrategiaFrete; // agregação

    public Pedido(double peso, CalculaFrete estrategiaFrete) {
        this.peso = peso;
        this.estrategiaFrete = estrategiaFrete;
    }

    public void setEstrategiaFrete(CalculaFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete(){
        return estrategiaFrete.calcularFrete(this.peso); // um return de um return
    }


}