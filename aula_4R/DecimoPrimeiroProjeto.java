package aula_4R;

import java.util.Scanner;

public class DecimoPrimeiroProjeto {
    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa();

        try (Scanner leitor = new Scanner(System.in)){

            System.out.println("Digite o peso: ");
            objetoPessoa.setPeso(leitor.nextFloat());

            System.out.println("Digite a altura: ");
            objetoPessoa.setAltura(leitor.nextFloat());

            System.out.println("IMC: " + objetoPessoa.calcularIMC());
        }
    }
}
