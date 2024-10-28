public class Condiction {
    public static void main(String[] args) {

        int anoDeContratacao = 2024;
        boolean contratadoNaMacfre = true;
        double nota = 10.0;
        String tipoContratacao = "CLT";

        if (anoDeContratacao >= 2024) {
            System.out.println("Contratado!");
        } else {
            System.out.println("Está na Sectotech");
        }

        if (contratadoNaMacfre || tipoContratacao.equals("CLT")) {
            System.out.println("Você é Pleno");
        } else {
            System.out.println("Você é Juninho");
        }
    }
}
