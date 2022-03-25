package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class

ContaTest {



    @Test
    void deveRetornarEstruturaConta() {
        Conta conta = new ContaNormal();

        assertEquals("Conta Normal", conta.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComContaPoupanca() {
        Conta curso = new ContaPoupanca(new ContaNormal());

        assertEquals("Conta Normal/Conta Poupanca", curso.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComContaSalario() {
        Conta curso = new ContaSalario(new ContaNormal());

        assertEquals("Conta Normal/Conta Salario", curso.getEstrutura());
    }


    @Test
    void deveRetornarEstruturaContaComContaSalarioComPoupanca() {
        Conta curso = new ContaPoupanca(new ContaSalario(new ContaNormal()));

        assertEquals("Conta Normal/Conta Salario/Conta Poupanca", curso.getEstrutura());
    }



}