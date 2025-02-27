package jogo.personagem;

import agente.Acao;
import agente.Controlo;
import agente.Percepcao;

public class ControloPersonagem implements Controlo {

    /**
     * Construtor da classe ControloPersonagem
     */
    public ControloPersonagem(){

    }

    /**
     * Metodo publico percepcionar, que recebe uma percepção como argumento
     * @param percepcao
     * @return
     */
    public Acao percepcionar(Percepcao percepcao) {
        return null; //TO-DO
    }

    /**
     * Metodo mostrar
     */
    private void mostrar(){

    }

    /**
     * Metodo publico processar, que recebe uma percepção e devolve uma ação,
     * necessária devido ao facto de que a classe implementa Controlo
     * @param percepcao
     * @return
     */
    @Override
    public Acao processar(Percepcao percepcao) {
        return null; //TO-DO
    }

}
