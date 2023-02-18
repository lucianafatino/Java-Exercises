package aula_4W;
import java.util.Date;
import java.util.Scanner;

public class DecimoSegundoProjeto {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Luciana");
        v.setSalario(1000.0f);
        v.setCpf("00000000000");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        // Motorista m = new Motorista();
        // m.getNome();

        try (Scanner leitor = new Scanner(System.in)){
            System.out.println("O salário do vendedor é de: " + v.calcularSalario());
        }
    }
}
