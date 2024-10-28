import java.sql.SQLOutput;
import java.util.Scanner;


public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua empresa favorita");
        String empresa = leitura.nextLine();
        System.out.println(empresa);
    }
}
