// import java.util.Scanner;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// import java.util.Random;

// public class Main{
//     public static void main(String[] args) throws IOException{
        /*Scanner s = new Scanner(System.in);
        
        System.out.println("Hello, what's your name?");
        String name = s.nextLine();

        System.out.println("What day is today, " + name + "?");
        String day = s.next();

        s.close();

        String workoutDay = "n";

        switch (day){
            case "monday":
                workoutDay = "Back and biceps";
                break;
            
            case "tuesday":
                workoutDay = "Glutes and posterior";
                break;

            case "wensday":
                workoutDay = "Chest and triceps";
                break;

            case "thursday":
                workoutDay = "Quads";
                break;
            
            case "friday":
                workoutDay = "Shoulder and Trapezius";
                break;
            
            case "saturday":
                workoutDay = "Rest day";
                break;

            case "sunday": 
                workoutDay = "Cardio in bike";
                break;

            default:
                System.out.println("""
                    Day invalid, try again. 
                    Remember to write the day with all lettesr in minuscule ;)  
                            """);
        }
        System.out.println("Today you will train " + workoutDay + ". Good workout, " + name + " ;)");

        //While
        Scanner scan = new Scanner(System.in);
        double mediaAvaliation = 0;
        double score = 0;
        int allScore = 0;

        while(score != -1){
            System.out.println("Digite uma nota  ou digite -1 para encerrar o programa ");
            score = scan.nextDouble();
                if(score != -1){
                    mediaAvaliation += score;
                    allScore++;     
                } 
        }

        scan.close();

        System.out.println(String.format("A média é: " + mediaAvaliation / allScore));

        //exercício
            // while(contador <= 10) {
            //     System.out.println(contador);
            //     contador++;
            // }
        //mesmo exercício com o for
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);               
            }

        
        //Crie um programa que simula um jogo de adivinhação, que deve gerar um número 
        //aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, 
        //em até 5 tentativas. A cada tentativa, o programa deve informar se o número 
        //digitado pelo usuário é maior ou menor do que o número gerado.
        Random r = new Random();
        int numberChoose = r.nextInt(100);
        
        Scanner scan1 = new Scanner(System.in);


        int i = 0;

        while(i < 5){
            switch(i){
                case 0:
                    System.out.println("Descover the number between 01 and 100 in five tries! Good luck :)");
                    int numberDigitized = scan1.nextInt();
                    
                    if (numberDigitized == numberChoose){
                        System.out.println("You win! Congrats ;)");
                        break;
                    } else {
                        if (numberDigitized < numberChoose){
                            System.out.println("That's is not the number. Try a number bigger!");
                        } 
                        if (numberDigitized > numberChoose){
                            System.out.println("That's is not the number. Try a number smaller!");     
                        }
                   }
                    i++;

                    break;
                case 1, 2, 3, 4: 
                    InputStreamReader ir = new InputStreamReader(System.in);
                    BufferedReader in = new BufferedReader(ir);
                    numberDigitized = Integer.parseInt(in.readLine());

                    if (numberDigitized == numberChoose){
                        System.out.println("You win! Congrats ;)");
                        break;
                    } else {
                        if (numberDigitized < numberChoose){
                            System.out.println("That's is not the number. Try a number bigger!");
                        } 
                        if (numberDigitized > numberChoose){
                            System.out.println("That's is not the number. Try a number smaller!");     
                        } 
                    }

                    if (i == 4){
                        System.out.println("You couldn't. I'm sorry. The number was " + numberChoose);
                    } 
                    i++;

                    break;
            }
            scan1.close();
        }
        }

        //Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba
        //"Número positivo", caso contrário, exiba "Número negativo".
        System.out.println("Escreva um número ");
        Scanner scan2 = new Scanner(System.in);
        double number = scan2.nextDouble();

        if (number > 0) {
            System.out.println("Este número é positivo.");
        } else {
            System.out.println("Este número é negativo.");
        }

        scan2.close();

        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem
        //indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.println("Insira dois números inteiros ");
        Scanner scan3 = new Scanner(System.in);
        double number1 = scan3.nextDouble();
        double number2 = scan3.nextDouble();

        if (number1 == number2){
            System.out.println("Estes números são iguais.");
        }
        if (number1 != number2){
            System.out.println("Estes números são diferentes e ");
        }
        if (number1 > number2){
            System.out.println("o primeiro número é maior que o segundo.");
        }
        if (number1 < number2){
            System.out.println("o segundo número é maior que o primeiro.");
        }

        scan3.close();

        //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular
        //área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("""
                Escolha uma das opções abaixo:
                1 - Calcular área do quadrado
                2 - Calcular área do círculo
                """);
        
        Scanner scan4 = new Scanner(System.in);
        int choose = scan4.nextInt();
        
        switch(choose){
            case 1: 
                System.out.println("""
                    A área do quadrado é calculada a partir da fórmula> L.L (Lado vezes Lado).
                    Se tivermos um quadrado de lado = 4, por exemplo, sua área será: 
                        """ + 4*4);
                break;
            case 2: 
                System.out.println("""
                    A área do círculo é calculada a partir da fórmula> A = π r² (pi vezes o raio elevado ao quadrado).
                    Se tivermos um círculo de raio = 4, por exemplo, considerando pi como 3.14, sua área será: 
                        """ + 3.14*(4*4));
        }
        scan4.close();

        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        Scanner scan5 = new Scanner(System.in);
        
        System.out.println("write a number:: ");
        double number = scan5.nextDouble();

        for (int i = 1; i < 11; i++) {
            double result = number * i;
            System.out.println(result);
        }
        
        scan5.close();

        //Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número
        //é par ou ímpar e exiba uma mensagem correspondente.
        Scanner scan6 = new Scanner(System.in);
        
        System.out.println("write a integer number: ");
        int number = scan6.nextInt();

        if (number % 2 == 0){
            System.out.println("this number is even");
        } else {
            System.out.println("this number is odd");
        }

        scan6.close();

        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        Scanner scan7 = new Scanner(System.in);

        System.out.println("write a number: ");
        double number = scan7.nextDouble();
        double newNumber = number;

        //n! = n . (n-1) . (n-2) . (n-3)!

        while (number > 1) {
            newNumber = newNumber * (number - 1);
              number--;
        }

        System.out.println(newNumber);

        scan7.close();*/

    //}
//}