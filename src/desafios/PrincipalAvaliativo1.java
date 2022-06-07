package desafios;

import java.util.*;

public class PrincipalAvaliativo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados para quatro funcionários:");

        List<Funcionario> func = new ArrayList<Funcionario>();
        Funcionario padrao = new Funcionario();

        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i + 1));
            System.out.println();

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            padrao.setIdade(idade);

            System.out.print("Cargo: ");
            sc.next();
            String cargo = sc.nextLine();

            System.out.print("Situação ");
            String situacao = sc.next().toLowerCase();
            padrao.setSituacao(situacao);

            func.add(new Funcionario(nome, idade, cargo, situacao));
        }

        System.out.println();

        Funcionario demissao = func.get(0);
        System.out.println("O(A) funcionário(a) " + demissao.getNome() + " " + demissao.demitirFuncionario());

        System.out.println();

        Funcionario promocao = func.get(1);
        System.out.println("O(A) funcionário(a) " + promocao.getNome() + " foi promovido(a) a " + promocao.trocarCargoFuncionario("Desenvolvedor Pleno"));

        System.out.println();

        Funcionario aniversario = func.get(2);
        System.out.println("O(A) funcionário(a) " + aniversario.getNome() + " está fazendo " + aniversario.fazerAniversario() + " anos hoje!");

        System.out.println();

        Funcionario salario = func.get(3);
        System.out.println("Salário de R$" + String.format("%.2f", salario.pagarSalario(20, 100)) + " pago ao(à) funcionário(a) " + salario.getNome());

        sc.close();
    }

}
