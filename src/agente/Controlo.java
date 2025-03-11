package agente;

/**
 * Interface Controlo, que é implementada pelas
 * classes Agente e ControloPersonagem
 * e que contém o metodo processar.
 * Responsavel pelo papel de controlador.
 */
public interface Controlo {
    // Metodo publico processar, que recebe uma percepção e devolve uma ação.
    public Acao processar(Percepcao percepcao);
}