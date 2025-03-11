package maqest;

import agente.Acao;
import ambiente.Evento;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa um estado na máquina de estados
 */
public class Estado {

    /**
     * Mapa de transições, onde a chave é um evento e o valor é uma transição
     */
    private Map<Evento, Transicao> transicoes;

    /**
     * Nome do estado, privado para read-only
     */
    private String nome;
    public String getNome(){
        return nome;
    }

    /**
     * Construtor da classe Estado, inicializa o hashmap de transições
     * @param nome
     */
    public Estado(String nome){
        this.nome = nome;
        this.transicoes = new HashMap<Evento, Transicao>();
    }

    /**
     * Metodo processar, que retorna a transição correspondente ao evento,
     * usando o hashmap de transições
     * @param evento
     */
    public Transicao processar(Evento evento){
        return transicoes.get(evento);
    }

    /**
     * metodo transicao, que adiciona uma transição ao hashmap de transições
     * e retorna o estado atual para permitir a chamada de métodos em cadeia,
     * por exemplo: para poder fazer iteração .transicao().transicao().transicao()...
     * @param evento
     * @param estadoSucessor
     * @return
     */
    public Estado transicao(Evento evento, Estado estadoSucessor){
        transicoes.put(evento, new Transicao(estadoSucessor, null));
        return this;
    }

    /**
     * metodo similar ao antecedente, porém com uma ação associada
     * @param evento
     * @param estadoSucessor
     * @param acao
     * @return
     */
    public Estado transicao(Evento evento, Estado estadoSucessor, Acao acao){
        transicoes.put(evento, new Transicao(estadoSucessor, acao));
        return this;
    }

}
