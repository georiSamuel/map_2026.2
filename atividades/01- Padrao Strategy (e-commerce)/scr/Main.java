import frete.*;
import frete.FreteSedex;

public class Main {
    public static void main(String[] args) {

        // SEDEX
        Pedido pedidoGeoris = new Pedido(10, new FreteSedex()); // criando o objeto na hora
        System.out.println("SEDEX: R$ " + pedidoGeoris.calcularFrete());

        // PAC
        pedidoGeoris.setEstrategiaFrete(new FretePAC());
        System.out.println("PAC: R$ " + pedidoGeoris.calcularFrete());

        // Retirada na Loja
        pedidoGeoris.setEstrategiaFrete(new FreteRetirada());
        System.out.println("Retirada na Loja: R$ " + pedidoGeoris.calcularFrete());

        // Transportadora Expressa
        pedidoGeoris.setEstrategiaFrete(new FreteTransportadoraExpressa());
        System.out.println("Transportadora Expressa: R$ " + pedidoGeoris.calcularFrete());

        // Fretex Internacional
        pedidoGeoris.setEstrategiaFrete(new FreteInternacional());
        System.out.println("Internacional: R$ " + pedidoGeoris.calcularFrete());
    }

}