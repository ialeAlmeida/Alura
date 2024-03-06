package exercicio01;
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    //getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //setters
    //Em um sistema oficial, eu provavelmente não faria um set para numeroConta, pois é um id para cada conta, ids nao mudam. 
    //Se em algum momento precisarem mudar, aí sim, implementa um set pra ele. 
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}