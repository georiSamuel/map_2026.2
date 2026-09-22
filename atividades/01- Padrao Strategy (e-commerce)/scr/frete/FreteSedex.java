package frete;

public class FreteSedex implements CalculaFrete {
    @Override
    public double calcularFrete(double peso) {
        return (peso * 5) + 20;
    }
}