package jogo.personagem;

import agente.Acao;
import agente.Controlo;
import agente.Percepcao;
import ambiente.Evento;
import jogo.ambiente.ComandoJogo;
import jogo.ambiente.EventoJogo;
import maqest.Estado;
import maqest.MaquinaEstados;

/**
 * Classe que representa o controlo do personagem, implementa Controlo
 */
public class ControloPersonagem implements Controlo {

    /**
     * Variavel privada maqest do tipo MaquinaEstados,
     * que representa a maquina de estados do personagem
     */
    private MaquinaEstados maqest;

    /**
     * Metodo getEstado, devolve o estado do personagem, usando a maquina de estados
     * @return
     */
    public Estado getEstado(){
        return maqest.getEstado();
    }

    /**
     * Construtor da classe ControloPersonagem,
     * nela criamos os estados todos tal como as ações,
     * depois disso, associamos os estados com as ações,
     * utilizando o diagrama do slide 13 do P1
     */
        public ControloPersonagem(){
            Estado procura = new Estado("Procura");
            Estado inspecao = new Estado("Inspeção");
            Estado registo = new Estado("Registo");
            Estado observacao = new Estado("Observação");
            Acao procurar = new Acao(ComandoJogo.PROCURAR);
            Acao aproximar = new Acao(ComandoJogo.APROXIMAR);
            Acao observar = new Acao(ComandoJogo.OBSERVAR);
            Acao fotografar = new Acao(ComandoJogo.FOTOGRAFAR);

            procura
                    .transicao(EventoJogo.ANIMAL, observacao, aproximar)
                    .transicao(EventoJogo.RUIDO, inspecao, aproximar)
                    .transicao(EventoJogo.SILENCIO, procura, procurar);

            inspecao
                    .transicao(EventoJogo.ANIMAL, observacao, aproximar)
                    .transicao(EventoJogo.RUIDO, inspecao, procurar)
                    .transicao(EventoJogo.SILENCIO, procura);

            observacao
                    .transicao(EventoJogo.ANIMAL, registo, observar)
                    .transicao(EventoJogo.FUGA, inspecao);

            registo
                    .transicao(EventoJogo.ANIMAL, registo, fotografar)
                    .transicao(EventoJogo.FOTOGRAFIA, procura)
                    .transicao(EventoJogo.FUGA, procura);

            //definir o estado inicial
            maqest = new MaquinaEstados(procura);
        }

    /**
     * Metodo mostrar, dá print ao estado do personagem
     */
    private void mostrar(){
        System.out.println("Estado: " + getEstado().getNome());
    }

    /**
     * Metodo publico processar, que recebe uma percepção e devolve uma ação,
     * este metodo foi implementado de acordo com o diagrama do slide 15 do P1
     * @param percepcao
     * @return
     */
    @Override
    public Acao processar(Percepcao percepcao) {
        Evento evento = percepcao.getEvento();
        Acao acao = maqest.processar(evento);
        mostrar();
        return acao;
    }

}
