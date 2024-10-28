import javax.swing.event.AncestorEvent;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Eu sou Desenvolvedor Pleno em Java");
        System.out.println("Saí do PHP para Java");

        int anoDeContratacao = 2024;
        System.out.println("Aqui estou tentando concatenar " + anoDeContratacao);
        boolean contratadoNaMacfre = true;
        double nota = 10.0;

        double media = 8 + 10 + 3 /3;
        String resultadoTeste = "Parabéns! É um prazer te ter aqui conosco";

        System.out.println(resultadoTeste + nota);

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        int classificacao= (int) (media / 2);

        System.out.println(classificacao);*/

        /*String mesagemTemperatura = "Aqui está sendo feita a conversão de Celsius para Fahrenheit: ";
        int temperatura = 30;
        String mensagemDoMeio = " graus Celsius são: ";
        double conversao = temperatura * 1.8 + 32;
        String fahrenheit = " graus Fahrenheit.";

        System.out.println(mesagemTemperatura + temperatura + mensagemDoMeio + conversao + fahrenheit);*/

        String introducao = "Aqui está sendo feita a conversão de Celsius para Fahrenheit: ";
        String unidadeCelsius = " graus Celsius são: ";
        String unidadeFahrenheit = " graus Fahrenheit.";

        int temperatura = 30;
        double conversao = temperatura * 1.8 + 32;

        // Construção da mensagem final usando as variáveis armazenadas
        String mensagem = introducao + temperatura + unidadeCelsius + String.format("%.2f", conversao) + unidadeFahrenheit;

        System.out.println(mensagem);

    }
}

