import java.sql.SQLOutput;
import java.util.Scanner;

//classe para ler dados
public class Leitura {
    public static void main(String[] args) {
        // instância da classe scanner passando o objeto System.in como parâmetro para ler a entrada do usuário pelo teclado.
        Scanner leitura = new Scanner(System.in);

        // métodos para ler nextLine(),nextInt(), de acordo com o tipo
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme?");
        Double nota = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(nota);


    }
}
