package jogo.personagem;

import agente.Agente;
import ambiente.Ambiente;
import ambiente.Comando;
import ambiente.Evento;
import jogo.ambiente.AmbienteJogo;

/**
 * Classe que representa um personagem no ambiente do jogo, extende a classe Agente
 */
public class Personagem extends Agente {

    /**
     * Construtor da classe Personagem, iniciada com o super
     * da classe Agente, com um ambiente e um controlo como argumentos.
     * Controlo personagem é um controlo pois essa classe implementa Controlo
     * @param ambiente
     */
    public Personagem(Ambiente ambiente) {
        super(ambiente, new ControloPersonagem() );
    }

}
