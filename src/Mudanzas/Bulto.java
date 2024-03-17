package Mudanzas;

public class Bulto {
    private int id;
    private int volumen;
    private int peso;
    private boolean fragil;

//Bulto builders
    public Bulto(int id, int volumen, int peso, boolean fragil){
        this.id = id;
        this.volumen = volumen;
        this.peso = peso;
        this.fragil = fragil;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setFragil(boolean fragil){
        this.fragil = fragil;
    }

    //Getters
    public int getId(){
        return this.id;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public int getPeso(){
        return this.peso;
    }
    public boolean getFragil(){
        return this.fragil;
    }

    public String toString() {
        if (fragil) {

        return "Bulto: " + this.id + ".\n" +
                "Volumen: " + this.volumen + "  l.\n" +
                "Peso: " + this.peso + " Kg.\n" +
                "Frágil: Sí.";
        }else {
            return "Bulto: " + this.id + ".\n" +
                    "Volumen: " + this.volumen + " l.\n" +
                    "Peso: " + this.peso + " Kg.\n" +
                    "Frágil: No.";
        }
    }



}
