package br.senac.rn.introducaooo;

public class Lampada {

    public final Integer FREQUENCIA = 60;

    public String cor;
    public Integer potencia;
    public Integer tensao;
    public Float comprimento;
    private Boolean estado = false;

    public Lampada() {
    }

    public Lampada(String cor) {
        this.cor = cor;
    }

    public Lampada(String cor, Integer potencia) {
        this.cor = cor;
        this.potencia = potencia;
    }

    public void acende() {
        estado = true;
    }

    public void apaga() {
        estado = false;
    }

    public String statusLampada() {
        if (estado == true) {
            return "LIGADO";
        }
        return "DESLIGADO";
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "cor='" + cor + "\'" +
                ", estado=" + statusLampada() +
                '}';
    }

}
