package Enums.Prioridad;

public enum Prioridad {
baja(0), media(1), alta(2);

    public int getValor() {
        return valor;
    }

    private int valor;
    private Prioridad(int valor){
        this.valor = valor;

    }
}
