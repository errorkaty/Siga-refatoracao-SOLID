package siga;

public class ServicoEmail {

    // Responsabilidade (c): COMUNICAÇÃO
    public void enviar(String conteudo, String destinatario) {
        System.out.println("[email] Enviando relatório para: " + destinatario);
        System.out.println(conteudo);
    }
}