public class Conta {
    private String numeroConta;
    private String titularConta;
    private double saldo;

    public static final double TAXA = 5.00;
    public Conta(String numeroConta, String titularConta, double saldo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }
    public Conta(String numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }


    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void depositar(double valorDepositar) {
       saldo += valorDepositar;
    }

    public void saque(double valorSaque) {
         saldo -= (TAXA + valorSaque);
    }

@Override
    public String toString() {
        return "Account "+numeroConta+", Holder: "+titularConta+", Balance: $ "+String.format("%.2f", saldo);
    }
}
