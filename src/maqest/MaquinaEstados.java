package maqest;

import agente.Acao;
import ambiente.Evento;

/**
 * Classe que representa uma máquina de estados,
 * uma máquina de estados é composta por um estado inicial e um estado atual,
 * e é responsável por processar eventos e transições entre estados.
 * Neste caso, foi utilizado o modelo geral de sistema digital
 * - Função de transição de estado (δ): determina o próximo estado com base
 *   no estado atual e na entrada recebida.
 *   δ: Q × Σ → Q
 *
 *  - Função de saída (λ): define a saída do sistema,
 *  dependendo do estado e da entrada (Mealy).
 *  λ: Q × Σ → Z
 *
 */
public class MaquinaEstados {

    /**
     * Estado atual da máquina de estados
     */
    private Estado estado;
    public Estado getEstado() {
        return estado;
    }

    /**
     * Construtor da classe MaquinaEstados, inicializa o estado
     * com o estado inicial passado como argumento
     * @param estadoInicial
     */
    public MaquinaEstados(Estado estadoInicial) {
        this.estado = estadoInicial;
    }

    /**
     * Metodo processar, que recebe um evento como argumento e
     * retorna uma ação correspondente ao evento, processando a transição,
     * caso exista, entre estados da máquina de estados.
     * Aplicada de acordo com o diagrama do slide 16 de P1
     * @param evento
     * @return
     */
    public Acao processar(Evento evento) {
        Transicao transicao = estado.processar(evento);
        if (transicao != null) {
            estado = transicao.getEstadoSucessor();
            return transicao.getAcao();
        } else {
            return null;
        }
    }

}
