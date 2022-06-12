package aulas;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Empregados empregados1 = new Empregados();
        Empregados empregados2 = new Empregados();
        Scanner leitor = new Scanner(System.in);
        char opcao;
        float aumento;

        System.out.println("O salario de anual de " + empregados1.getNome() + " " + empregados1.getSobrenome() + " e " + empregados1.salarioAnual());
        System.out.println("O salario de anual de " + empregados2.getNome() + " " + empregados2.getSobrenome() + " e " + empregados2.salarioAnual());

        System.out.println("Deseja aumentar o salario dos seus empregados? ");
        opcao = leitor.nextLine().charAt(0);
        if(opcao == 's' || opcao == 'S') {
            System.out.println("Deseja aumentar o salario em quantos porcento? ");
            aumento = leitor.nextFloat() / 100;
            empregados1.setSalario(empregados1.aumentarSalario(aumento) + empregados1.getSalario());
            empregados2.setSalario(empregados2.aumentarSalario(aumento) + empregados2.getSalario());
            
            System.out.println("O novo salario de anual de " + empregados1.getNome() + " " + empregados1.getSobrenome() + " e " + empregados1.salarioAnual());
            System.out.println("O novo salario de anual de " + empregados2.getNome() + " " + empregados2.getSobrenome() + " e " + empregados2.salarioAnual());
        }

    }

}
