//Crie uma classe NumerosPrimos com métodos como 
//verificarPrimalidade() e listarPrimos(). Em seguida, crie
//duas subclasses, VerificadorPrimo e GeradorPrimo, que 
//herdam da classe NumerosPrimos. Adicione um método específico
//para cada uma das subclasses, como verificarSeEhPrimo() para
//o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

import java.lang.reflect.Array;

public class NumerosPrimos {
    // public void verificarPrimialidade(int numero) {
    //     if (numero / 1 == numero && numero / numero == 1) {
    //         System.out.println(numero + " é primo.");
    //     } else {
    //         System.out.println(numero + " não é primo.");
    //     }
    // }
    
    public boolean verificarPrimialidade(int numero) {
        if (numero <= 1) {
            return false;
        } 
        // for serve para verificar se o número tem divisores
        for (int i = 2; i * i <= numero; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }       

    //O código abaixo não me permitirá apresentar os números primos
    //até determinada qntd. Ele sór irá verificar se os números são
    //primos ou não.
    // public void listarPrimos(int qntd) {
    //     for (int i = 0; i == qntd; i++) {
    //         while (i / 1 == i && i / i == 1) {
    //             System.out.println(i);
    //         }
    //     }
    // }

    //Segunda tentativa
    //public void listarPrimos(int limite) {
    //    for (int i = 2; i <= limite; i++) {
    //        verificarPrimialidade(i);
    //         if (verificarPrimialidade(i) == true) {
    //             int[] ehPrimo = {i};
    //             System.out.println(ehPrimo[i]);
    //         }
    //     }
    // }

    //Para listar precisa usar um algoritmo matemático chamado de 
    //Peneira de Eratóstenes. A Peneira de Eratóstenes é um antigo
    //algoritmo matemático usado para encontrar todos os números 
    //primos até um determinado limite.
    
    public void listarPrimos(int limite) {
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimialidade(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
