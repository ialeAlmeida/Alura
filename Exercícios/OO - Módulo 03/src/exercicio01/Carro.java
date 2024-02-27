//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. 
//Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e
//exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias 
//específicas, utilizando-a na classe principal para definir preços e mostrar informações.

import java.util.Scanner;

public class Carro {
    protected String modelo;
    protected double preco2024;
    protected double preco2023;
    protected double preco2022; 

    //getters e setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco2022() {
        return preco2022;
    }
    public void setPreco2022(double preco2022) {
        this.preco2022 = preco2022;
    }

    public double getPreco2023() {
        return preco2023;
    }
    public void setPreco2023(double preco2023) {
        this.preco2023 = preco2023;
    }

    public double getPreco2024() {
        return preco2024;
    }
    public void setPreco2024(double preco2024) {
        this.preco2024 = preco2024;
    }

    public void exibeMenorEMaiorPreco() {
        Scanner s = new Scanner(System.in);

        System.out.println("Você quer saber o menor ou o maior preço desse modelo? ");
        String qntd = s.next();
        
        if (qntd.equals("menor")){
            if (preco2022 < preco2023 && preco2022 < preco2024) {
                System.out.println("R$" + preco2022 + " é o menor preço do(a) " + modelo + " comparando os anos de 2022, 2023 e 2024.");
            } if (preco2023 < preco2022 && preco2023 < preco2024) {
                System.out.println("R$" + preco2023 + " é o menor preço do(a) " + modelo + " comparando os anos de 2022, 2023 e 2024.");
            } if (preco2024 < preco2022 && preco2024 < preco2023) {
                System.out.println("R$" + preco2024 + " é o menor preço do(a) " + modelo + " comparando os anos de 2022, 2023 e 2024.");
            }
        } else if (qntd.equals("maior")) {
            if (preco2022 > preco2023 && preco2022 > preco2024) {
                System.out.println("R$" + preco2022 + " é o maior preço do(a) " + modelo + " comparando os anos de 2022, 2023 e 2024.");
            } if (preco2023 > preco2022 && preco2023 > preco2024) {
                System.out.println("R$" + preco2023 + " é o maior preço do(a)" + modelo + " comparando os anos de 2022, 2023 e 2024.");
            } if (preco2024 > preco2022 && preco2024 > preco2023) {
                System.out.println("R$" + preco2022 + " é o maior preço do(a) " + modelo + " comparando os anos de 2022, 2023 e 2024.");
            }
          }
    
        s.close();
    }

}