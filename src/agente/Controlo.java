package agente;

/**
 * Interface Controlo, que é implementada pelas classes Percepcao e Acao
 * e que contém o metodo processar.
 * Responsavel pelo papel de controlador.
 */
public interface Controlo {
    // Metodo publico processar, que recebe uma percepção e devolve uma ação.
    public Acao processar(Percepcao percepcao);
}
