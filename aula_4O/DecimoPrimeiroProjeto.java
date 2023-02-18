package aula_4O;

import java.util.Scanner;

public class DecimoPrimeiroProjeto {
    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        try (Scanner leitor = new Scanner(System.in)) {
            int i = 0;
            for(; i < 3; i++){
                System.out.println("Digite o nome do produto: ");
                nomeProduto = leitor.nextLine();

                System.out.println("Digite o preço de custo do produto: ");
                precoCusto = leitor.nextFloat();

                System.out.println("Digite o preço de venda do produto: ");
                precoVenda = leitor.nextFloat();

                totalCusto += precoCusto;
                totalVenda += precoVenda;

                if(precoCusto == precoVenda){
                    System.out.println("Houve empate entre o preço de custo e o preço de venda ");
                } else {
                    if(precoCusto > precoVenda){
                        System.out.println("Houve prejuizo");
                    } else{
                        System.out.println("Houve lucro");
                    }
                }
                System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preco de venda = " + precoVenda);
            }
            System.out.println("A média do preço de custo é de: " + (totalCusto / i));
            System.out.println("A média do preço de venda é de: " + (totalVenda / i));
        }
    }
}
