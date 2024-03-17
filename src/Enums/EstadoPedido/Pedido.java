package Enums.EstadoPedido;

import com.sun.jdi.Value;

public class Pedido {

    public void setEstadoActual(EstadoPedido estadoActual) {
        this.estado = estadoActual;
        System.out.println("-----NOTIFICACIÓN SOBRE TU PEDIDO----- \n" +"     -"+
                 estado.getMsg());
    }

    EstadoPedido estado = EstadoPedido.pendiente;


}
