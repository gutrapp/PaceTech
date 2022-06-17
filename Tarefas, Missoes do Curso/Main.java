package missao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        float dolarCotation, money, temperature;
        char option = 's';
        int option2;
        
        System.out.println("Informe a cotacao do dolar do dia: ");
        dolarCotation = leitorScanner.nextFloat();
        
        while (option != '3') {
            
            System.out.println("Oque deseja fazer: ");
            System.out.println("1 - Converter Moedas");
            System.out.println("2 - Converter Temperaturas");
            System.out.println("3 - Sair");
            option2 = leitorScanner.nextInt();

            if (option2 == 2) {
                option = 's';
                while (option == 'S' || option == 's') {
                    System.out.println("Oque deseja fazer: ");
                    System.out.println("1 - Celsius para Fahrenheit ");
                    System.out.println("2 - Fahrenheit para Celsius");
                    System.out.println("3 - Voltar");
                    option2 = leitorScanner.next().charAt(0);

                    if (option2 == '3') {
                        break;

                    } else if (option2 == '2') {
                        System.out.println("Informe sua temperatura: ");
                        temperature = (float) ((leitorScanner.nextFloat() - 32) * 0.55555555555);
                        System.out.println("Sua temperatura e de "
                                + temperature + "°C");

                    } else {
                        System.out.println("Informe sua temperatura: ");
                        temperature = (float) ((leitorScanner.nextFloat() * 1.8) + 32);
                        System.out.println("Sua temperatura e de "
                                + temperature + "°F");
                    }

                    System.out.println("Deseja continuar convertendo?(s/n)");
                    option = leitorScanner.next().charAt(0);
                }
            } else if (option2 == 1) {
                option = 's';
                while (option == 'S' || option == 's') {
                    System.out.println("Oque deseja fazer: ");
                    System.out.println("1 - Dolar para Real ");
                    System.out.println("2 - Real para Dolar");
                    System.out.println("3 - Voltar");
                    option2 = leitorScanner.next().charAt(0);

                    if (option2 == '3') {
                        break;

                    } else if (option2 == '1') {
                        System.out.println("Informe sua dinheiro: ");
                        money = leitorScanner.nextFloat() * dolarCotation;
                        System.out.println("Seu dinheiro convertido e de "
                                + money + "R$");

                    } else {
                        System.out.println("Informe sua dinheiro: ");
                        money = leitorScanner.nextFloat() / dolarCotation;
                        System.out.println("Seu dinheiro convertido e de "
                                + money + "U$");
                    }

                    System.out.println("Deseja continuar convertendo?(s/n)");
                    option = leitorScanner.next().charAt(0);
                }
            } else {
                option = '3';
            }

        }
    }
}
