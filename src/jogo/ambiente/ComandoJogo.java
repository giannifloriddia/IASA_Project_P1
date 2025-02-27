package jogo.ambiente;

import ambiente.Comando;
import ambiente.Evento;

/**
 * Enumerado de comandos do jogo
 */
public enum ComandoJogo implements Comando{

    //comandos do jogo
    PROCURAR, APROXIMAR, OBSERVAR, FOTOGRAFAR;

    /**
     * Metodo para printar o evento
     */
    @Override
    public void mostrar() {
        System.out.printf("\nEvento: %s\n", this);
    }

}
