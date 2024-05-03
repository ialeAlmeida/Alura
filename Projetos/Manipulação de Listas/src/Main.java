// import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);

        System.out.println("Digite seu limite de crédito: ");
        double limite = s.nextDouble();

        var cc1 = new CartaoCredito(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = s.next();

            System.out.println("Digite o valor da compra: ");
            double valor = s.nextInt();

            var c1 = new Compra(descricao, valor);

            boolean compraRealizada = cc1.lancaCompra(c1);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 1 para cadastrar uma compra ou digite 0 para sair ");
                sair = s.nextInt();
            } else {
                System.out.println("Compra negada! Saldo insuficiente.");
                sair = 0;
                Collections.sort(cc1.getCompras());
                System.out.println(cc1.getCompras());
            }
        }

        Collections.sort(cc1.getCompras());
        System.out.println(cc1.getCompras());

        s.close();
    }
}
