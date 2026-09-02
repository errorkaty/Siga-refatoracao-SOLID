/**
 * Código INICIAL da atividade — contém violações PROPOSITAIS do SOLID.
 *
 * PROBLEMA 1 — Violação do Princípio da Responsabilidade Única (SRP):
 * esta classe acumula TRÊS responsabilidades que mudam por motivos diferentes:
 *   (a) formatar o relatório (apresentação);
 *   (b) gravar o relatório em disco (persistência);
 *   (c) enviar o relatório por e-mail (comunicação).
 * Uma mudança em qualquer uma dessas áreas obriga a mexer nesta mesma classe.
 *
 * Tarefa (etapas 1 e 2 da ficha): identificar as responsabilidades misturadas
 * e separá-las em classes distintas (ex.: RelatorioFormatador, RelatorioRepositorio,
 * ServicoEmail), cada uma com um único motivo para mudar.
 */
package siga;

import java.util.List;

public class RelatorioFormatador {

    // Responsabilidade (a): FORMATAÇÃO
    public String formatar(List<Aluno> alunos) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Relatório de Alunos ===\n");

        for (Aluno aluno : alunos) {
            sb.append(aluno.getMatricula())
              .append(" - ")
              .append(aluno.getNome())
              .append(" - média: ")
              .append(aluno.getMedia())
              .append("\n");
        }

        return sb.toString();
    }
}