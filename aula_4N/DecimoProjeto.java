package aula_4N;

import java.util.Scanner;

public class DecimoProjeto {
    public static void main(String[] args) {
        try (Scanner leitorScanner = new Scanner(System.in)){
            char desejaContinuar = 'S';
            while(desejaContinuar == 'S' || desejaContinuar == 's'){
                System.out.println("Digite um número:");
                int numero = leitorScanner.nextInt();
                if(numero == 0){
                    System.out.println("O número é zero");
                } else {
                    if(numero > 0){
                        System.out.println("O número é postivo");
                    } else{
                        System.out.println("O número é negativo");
                    }
                }
                System.out.println("Deseja continuar? S/N: ");
                desejaContinuar = leitorScanner.next().charAt(0);
            }
            if(desejaContinuar == 'N' || desejaContinuar == 'n'){
                System.out.println("Programa Finalizado!");
            }
        }
    }
}
