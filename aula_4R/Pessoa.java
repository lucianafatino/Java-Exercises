package aula_4R;

public class Pessoa {
    // atributos (características)
    private float peso;
    private float altura;

    // método construtor
    // public Pessoa(){
    //     System.out.println("Executando o método construtor");
    // }

    // métodos (ações)
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }


    // Método acessores - Dão acesso aos dados da pessoa
    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getPeso(){
        return peso;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }
}
