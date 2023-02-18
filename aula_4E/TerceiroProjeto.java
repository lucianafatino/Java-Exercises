package aula_4E;

import java.util.Scanner;

public class TerceiroProjeto {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            // Entrada de Dados
            int idade = leitor.nextInt();
            float cotacaoDolar = leitor.nextFloat();
            double cotacaoEuro = leitor.nextDouble();
            String nome = leitor.nextLine(); // le uma frase inteira
            String codigoRua = leitor.next(); // le uma palavra

            // saida de dados
            System.out.println("Texto exibido no console" + idade);
            System.out.println("Texto exibido no console" + cotacaoDolar);
            System.out.println("Texto exibido no console" + cotacaoEuro);
            System.out.println("Texto exibido no console" + nome);
            System.out.println("Texto exibido no console" + codigoRua);
        }
    }
}
