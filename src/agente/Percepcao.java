package agente;

import ambiente.Evento;

/**
 * Classe Percepcao, que implementa a interface Controlo.
 */
public class Percepcao implements Controlo{

    /**
     * Construtor da classe Percepcao, com um evento como argumento.
     */
    public Percepcao(Evento evento){

    }

    /**
     * Atributo privado evento, usando um getter para read-only,
     * fazendo assim com que não seja possível alterar o evento exteriormente,
     * mas seja possivel acessa-lo.
     */
    private Evento evento;
    public Evento getEvento(){
        return evento;
    }

    /**
     * Metodo processar, obrigatorio pela interface Controlo,
     * que recebe uma percepcao e devolve uma ação.
     */
    public Acao processar(Percepcao percepcao) {
        return null;
    }
}
