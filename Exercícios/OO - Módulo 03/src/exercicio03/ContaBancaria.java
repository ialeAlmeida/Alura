
//Crie uma classe ContaBancaria com métodos para realizar operações
//bancárias como depositar(), sacar() e consultarSaldo(). Em seguida,
//crie uma subclasse ContaCorrente que herda da classe ContaBancaria. 
//Adicione um método específico para a subclasse, como 
//cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
public class ContaBancaria {
    protected double saldo;
    protected int numeroConta;
    protected int qntdDeDepositos;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
        qntdDeDepositos++;
    }

    public void saca(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void consultaSaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }
}
