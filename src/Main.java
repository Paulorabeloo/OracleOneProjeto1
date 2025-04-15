//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento); // concatenação
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        // Média calculada pelas 3 notas da Jack, Paulo e Suelen
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse; // string é uma classe
        // assim é bom para mostrar várias coisas de uma vez como texto
        sinopse = """ 
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}