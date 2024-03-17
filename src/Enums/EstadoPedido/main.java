package Enums.EstadoPedido;

import static Enums.EstadoPedido.EstadoPedido.procesando;

public class main {
    public static void main(String args[]){
        Pedido pedidoActual = new Pedido();

        pedidoActual.setEstadoActual(procesando);
    }
}
