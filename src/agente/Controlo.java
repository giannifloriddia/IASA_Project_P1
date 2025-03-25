package agente;

/**
 * Interface Controlo, que é implementada pelas
 * classes Agente e ControloPersonagem
 * e que contém o metodo processar.
 * Responsavel pelo papel de controlador.
 * Implementa o processamento interno
 * do agentee que relaciona a percecao com a acao.
 * Implementa a "inteligencia do agente"
 */
public interface Controlo {
    // Metodo publico processar, que recebe uma percepção e devolve uma ação.
    public Acao processar(Percepcao percepcao);
}
