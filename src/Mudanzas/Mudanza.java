package Mudanzas;

public class Mudanza {
    private Camion[] camionesMudanza;
    private Bulto[] bultosMudanza;
    private int id;
    private int distancia;

    public Mudanza(int id, int distancia, Bulto[] bultosMudanza, Camion[] camionesMudanza){
        this.id = id;
        this.distancia = distancia;
        this.bultosMudanza = bultosMudanza;
        this.camionesMudanza = camionesMudanza;
    }
    public int coste(){
        int pesoTotalNoFragil = 0;
        int pesoTotalFragil = 0;
        for (int i = 0; i < bultosMudanza.length; i++) {
            if (bultosMudanza[i].getFragil()){
                pesoTotalFragil += bultosMudanza[i].getPeso();
            }else {
                pesoTotalNoFragil += bultosMudanza[i].getPeso();
            }

        }
        int costeDesplazamiento = distancia*2;
        int costePeso = pesoTotalNoFragil+(pesoTotalFragil*4);
        return costeDesplazamiento+costePeso;
    }
}
