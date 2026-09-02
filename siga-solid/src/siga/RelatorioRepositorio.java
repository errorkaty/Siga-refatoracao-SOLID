package siga;

public class RelatorioRepositorio {

    // Responsabilidade (b): PERSISTÊNCIA
    public void salvarEmArquivo(String conteudo, String caminho) {
        System.out.println("[disco] Gravando relatório em: " + caminho);
        System.out.println(conteudo);
    }
}