package aula_4J;

import java.util.Scanner;

public class SetimoProjeto {
    public static void main(String[] args) {
        int numero;
        try (Scanner leitorScanner = new Scanner(System.in)) {
            System.out.println("Digite um valor entre 100 e 200");
            numero = leitorScanner.nextInt();
        }
        if(numero >= 100 && numero <= 200){
            System.out.println("O número está no intervalo");
        } else {
            System.out.println("O número não está no intervalo");
        }
    }
}
