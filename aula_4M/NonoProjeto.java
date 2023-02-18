package aula_4M;
import java.util.Scanner;

public class NonoProjeto {
    public static void main(String[] args) {
        int total = 10;
        try (Scanner leitorScanner = new Scanner(System.in)) {
            while(total > 0){
                String nomeAluno = leitorScanner.nextLine();
                int idadeAluno = leitorScanner.nextInt();

                System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

                total = total - 1;
            }
        }
    }
}
