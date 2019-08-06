package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.ContaPoupanca;

public class TesteContaPoupanca {

    public static void main(String[] args) {

        ContaPoupanca contaJefferson = new ContaPoupanca();

        contaJefferson.setTitular("Jefferson andrade");

        contaJefferson.deposita(1000.0);

        System.out.println(contaJefferson);

        for (int i = 0; i > 2; i++) {
            contaJefferson.rende();
            System.out.println(contaJefferson);
        }
    }
}
