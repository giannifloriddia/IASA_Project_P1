package maqest;

import agente.Acao;

/**
 * Classe Transicao que representa a transição de um estado para outro
 * numa máquina de estados
 */
public class Transicao {

    /**
     * Estado sucessor da transição
     */
    private Estado estadoSucessor;
    public Estado getEstadoSucessor() {
        return estadoSucessor;
    }

    /**
     * Ação associada à transição
     */
    private Acao acao;
    public Acao getAcao() {
        return acao;
    }

    /**
     * Construtor da classe Transicao, inicializa o estado sucessor e a ação
     * @param estadoSucessor
     * @param acao
     */
    public Transicao(Estado estadoSucessor, Acao acao) {
        this.acao = acao;
        this.estadoSucessor = estadoSucessor;
    }

}
