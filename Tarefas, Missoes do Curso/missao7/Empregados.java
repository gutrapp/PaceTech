package aulas;

import java.util.Scanner;

public class Empregados {
    
    private Scanner leitor = new Scanner(System.in);
    private String nome;
    private String sobrenome;
    private float salario;

    public Empregados() {
        System.out.println("Informe seu nome");
        nome = leitor.nextLine();
        System.out.println("Informe seu sobrenome");
        sobrenome = leitor.nextLine();
        System.out.println("Informe seu salario");
        salario = leitor.nextFloat();
        if(salario < 0) {
            salario = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario < 0) {
            this.salario = 0;
        } else {
        this.salario = salario;
        }
    }

    public float salarioAnual() {
        return salario * 12;
    }

    public float aumentarSalario(float aumento) {
        return salario * aumento;
    }

    }

