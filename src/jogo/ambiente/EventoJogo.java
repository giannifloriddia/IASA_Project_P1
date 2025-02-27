package jogo.ambiente;

import ambiente.Comando;
import ambiente.Evento;

/**
 * Enumerado de eventos do jogo
 */
public enum EventoJogo implements Evento {

    //Eventos do jogo
    SILENCIO, RUIDO, ANIMAL, FUGA,  FOTOGRAFIA, TERMINAR;

    /**
     * Metodo para printar o evento
     */
    @Override
    public void mostrar() {
        System.out.printf("\nEvento: %s\n", this);
    }

}
