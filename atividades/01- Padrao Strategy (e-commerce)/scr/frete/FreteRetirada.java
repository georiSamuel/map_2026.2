package frete;

public class FreteRetirada implements CalculaFrete {
    @Override
    public double calcularFrete(double peso) {
        return 0; // Sem custo
    }
}