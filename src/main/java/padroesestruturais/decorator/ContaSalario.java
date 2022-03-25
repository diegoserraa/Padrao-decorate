package padroesestruturais.decorator;

public class ContaSalario extends ContaDecorator {

    public ContaSalario(Conta conta) {
        super(conta);
    }



    public String getNomeEstrutura() {
        return "Conta Salario";
    }
}
