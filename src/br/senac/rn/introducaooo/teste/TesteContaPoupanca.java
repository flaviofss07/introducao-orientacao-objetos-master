package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.ContaPoupanca;
import br.senac.rn.introducaooo.Pessoa;
import br.senac.rn.introducaooo.Sexo;

public class TesteContaPoupanca {

    public static void main(String[] args) {

        ContaPoupanca contaJefferson = new ContaPoupanca();

        Pessoa jefferson = new Pessoa();

        jefferson.setNome("Jefferson andrade");
        jefferson.setSexo(Sexo.MASCULINO);

        contaJefferson.setTitular(jefferson);

        contaJefferson.deposita(1000.0);

        System.out.println(contaJefferson);

        for (int i = 0; i > 2; i++) {
            contaJefferson.rende();
            System.out.println(contaJefferson);
        }
    }
}
