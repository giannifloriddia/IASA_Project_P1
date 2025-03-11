package agente;

import ambiente.Comando;

/**
 * Classe Acao
 */
public class Acao{

    /**
     *  Construtor da classe Acao, com um comando como argumento.
     */
    public Acao(Comando comando){
        this.comando = comando;
    }

    /**
     *  Atributo privado comando, usando um getter para read-only,
     *  fazendo assim com que não seja possível alterar o comando exteriormente,
     *  mas seja possivel acessá-lo.
     */
    private Comando comando;
    public Comando getComando(){
        return comando;
    }

}
