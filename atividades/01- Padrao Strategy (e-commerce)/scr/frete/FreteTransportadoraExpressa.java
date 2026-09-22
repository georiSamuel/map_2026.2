package frete;

public class FreteTransportadoraExpressa implements CalculaFrete {
    @Override
    public double calcularFrete(double peso) {
        return (peso * 7) + 50;
    }
}