package frete;

public class FretePAC implements CalculaFrete {
    @Override
    public double calcularFrete(double peso) {
        return (peso * 2) + 10;
    }
}