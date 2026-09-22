package frete;

public class FreteInternacional implements CalculaFrete {
    @Override
    public double calcularFrete(double peso) {
        return (peso * 12) + 25.0; // Taxa de importação de 25 e peso multiplicado por 12
    }
}