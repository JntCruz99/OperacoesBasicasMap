package Dicionario;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("corno", "pessoa traida");
        dicionario.adicionarPalavra("lindo", "pessoa bonita");

        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("lindo"));

    }
}
