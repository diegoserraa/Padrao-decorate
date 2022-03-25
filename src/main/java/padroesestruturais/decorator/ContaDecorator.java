package padroesestruturais.decorator;

public abstract class ContaDecorator implements Conta {

    private Conta conta;
    public String estrutura;

    public ContaDecorator(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }





    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.conta.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
