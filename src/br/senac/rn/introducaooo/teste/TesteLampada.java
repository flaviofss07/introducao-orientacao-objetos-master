package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Lampada;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada("Preto", 50);

        lampada.acende();

//        lampada.FREQUENCIA = 100;

        System.out.println(lampada.FREQUENCIA);

    }

}
