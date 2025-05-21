import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        //laço de repetição para receber todas as 3 notas do filme
        for(int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; //recebe oq já tinha(mediaAvaliacao) + nota, está acumulando as notas
        }

        System.out.println("Média de Avaliações: " + mediaAvaliacao / 3);
    }
}
