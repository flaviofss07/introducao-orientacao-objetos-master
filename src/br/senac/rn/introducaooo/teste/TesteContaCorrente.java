package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.ContaCorrente;
import br.senac.rn.introducaooo.Conta;



public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaFlavio = new ContaCorrente();

        contaFlavio.setTitular("Flavio Soares");
        contaFlavio.setAgencia("1234-5");
        contaFlavio.setNumero("4564-4");
        contaFlavio.deposita(800.0);

        System.out.println(contaFlavio);

        Conta contaCaio = new Conta();

        contaCaio.setTitular("Caio");
        contaCaio.setAgencia("3434-5");
        contaCaio.setNumero("4984-4");
        contaCaio.deposita(1000.0);

        System.out.println(contaCaio);

        contaCaio.transfere(contaFlavio, 100.0);

        System.out.println(contaFlavio);
        System.out.println(contaCaio);
    }
}
