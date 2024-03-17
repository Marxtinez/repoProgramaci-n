package Enums.EstadoPedido;

public enum EstadoPedido {
    pendiente("El pedido está pendiente."),
    procesando("El pedidio está procesando"),
    envidado("El pedido está en camino"),
    entregado("El pedido ha sido etnregado");

    private String msg;
    EstadoPedido(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return msg;
    }
}
