

public class ContaCorrente extends ContaBancaria {
    private double valorDeRendimento;

    public void adicionaValorDeRendimento() {
        if (qntdDeDepositos == 5)  {
            qntdDeDepositos = 0;
            valorDeRendimento = (saldo * 3) / 100;
            saldo += valorDeRendimento;
        }
    }
}
