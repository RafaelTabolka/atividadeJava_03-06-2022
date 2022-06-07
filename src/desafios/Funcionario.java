package desafios;

import java.util.Objects;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private String situacao;

    public Funcionario(String nome, int idade, String cargo, String situacao) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public Funcionario(String situacao) {
        this.situacao = situacao;
    }

    public Funcionario() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        Scanner sc = new Scanner(System.in);
        while (idade <= 0 || idade > 100) {
            System.out.println("Idade inválida. Digite novamente:");
            idade = sc.nextInt();
        }
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        Scanner sc = new Scanner(System.in);
        while (!(Objects.equals(situacao, "ativo")) && !(Objects.equals(situacao, "inativo"))) {
            System.out.println("Opção inválida. Digite (ativo) ou (inativo)");
            situacao = sc.next();
        }
        this.situacao = getSituacao();
    }

    public String demitirFuncionario() {
        if (Objects.equals(situacao, "ativo")) {
            return "foi promovido(a) a cliente";
        } else if (Objects.equals(situacao, "inativo")) {
            return "é invativo(a), logo não é mais um(a) funcionário(a)";
        }
        return null;
    }

    public String trocarCargoFuncionario(String novoCargo) {
        return cargo = novoCargo;
    }

    public double pagarSalario(double valorHora, double horasTrabalhadas) {
        if (Objects.equals(getSituacao(), "inativo")) {
            return 0;
        } else {
            return valorHora * horasTrabalhadas;
        }
    }

    public int fazerAniversario() {
        return ++this.idade;
    }

}
