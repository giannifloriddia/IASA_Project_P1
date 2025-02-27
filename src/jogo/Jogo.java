package jogo;

import jogo.ambiente.AmbienteJogo;
import jogo.ambiente.EventoJogo;
import jogo.personagem.Personagem;

/**
 * Classe principal Jogo, que contém o main e o metodo executar
 */
public class Jogo {

    /**
     * Atributos privados e staticos da classe Jogo´,
     * estáticos pois vão ser usados no executar que tem de ser estáticos
     */
    private static AmbienteJogo ambiente;
    private static Personagem personagem;

    /**
     * Main com a inicialização do ambiente e personagem
     * e função de executar dentro
     * @param args
     */
    public static void main(String[] args) {
        ambiente = new AmbienteJogo();
        personagem = new Personagem(ambiente);
        executar();
    }

    /**
     * Metodo privado executar, que cria um ambiente e um personagem novos,
     * estático pois é chamado no main que também é estático
     */
    private static void executar(){
        /**
         * pg. 9 P1
         * evoluir o ambiente e executar o personagem,
         * e repetir enquanto o evento do
         * ambiente for diferente de terminar
         */
        do {
            ambiente.evoluir();
            personagem.executar();
        } while (ambiente.getEvento() != EventoJogo.TERMINAR);
    }

}
