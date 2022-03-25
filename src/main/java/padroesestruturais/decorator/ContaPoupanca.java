package padroesestruturais.decorator;

public class ContaPoupanca extends ContaDecorator {

    public ContaPoupanca(Conta conta) {
        super(conta);
    }



    public String getNomeEstrutura() {
        return "Conta Poupanca";
    }
}
