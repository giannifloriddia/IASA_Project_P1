package agente;

import ambiente.Evento;

/**
 * Classe Percepcao
 */
public class Percepcao{

    /**
     * Construtor da classe Percepcao, com um evento como argumento.
     */
    public Percepcao(Evento evento){
        this.evento = evento;
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

}
