package agente;

import ambiente.Comando;

/**
 * Classe Acao, que implementa a interface Controlo.
 */
public class Acao implements Controlo{

    /**
     *  Construtor da classe Acao, com um comando como argumento.
     */
    public Acao(Comando comando){

    }

    /**
     *  Atributo privado comando, usando um getter para read-only,
     *  fazendo assim com que não seja possível alterar o comando exteriormente,
     *  mas seja possivel acessa-lo.
     */
    private Comando comando;
    public Comando getComando(){
        return comando;
    }

    /**
     * Metodo processar, obrigatorio pela interface Controlo,
     * que recebe uma percepcao e devolve uma ação.
     */
    public Acao processar(Percepcao percepcao) {
        return null;
    }

}
