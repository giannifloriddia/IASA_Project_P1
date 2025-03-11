package jogo.ambiente;

import ambiente.Ambiente;
import ambiente.Comando;
import ambiente.Evento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AmbienteJogo implements Ambiente {

    /**
     * Scanner para ler o input do utilizador
     * e um map de eventos, com a chave como string e o valor como EventoJogo
     */
    private Scanner scanner = new Scanner(System.in);
    private Map<String, EventoJogo> eventos;

    /**
     * Construtor da classe AmbienteJogo,
     * onde é inicializado o map de eventos
     * como um HashMap e adicionados os eventos
     * correspondentes a cada chave.
     * As chaves são as letras correspondentes a cada evento,
     * para que o utilizador possa escolher o evento
     */
    public AmbienteJogo(){
        eventos = new HashMap<String, EventoJogo>();
        eventos.put("s", EventoJogo.SILENCIO);
        eventos.put("r", EventoJogo.RUIDO);
        eventos.put("a", EventoJogo.ANIMAL);
        eventos.put("f", EventoJogo.FUGA);
        eventos.put("o", EventoJogo.FOTOGRAFIA);
        eventos.put("t", EventoJogo.TERMINAR);
    }

    /**
     * Metodo evoluir, que gera um evento
     * utilizando o metodo local gerarEvento
     */
    public void evoluir(){
        evento = gerarEvento();
    }

    /**
     * Metodo observar, que mostra o evento
     * se não for nulo
     * @return evento
     */
    public Evento observar(){
        if (evento != null){
            evento.mostrar();
        }
        return evento;
    }

    /**
     * Metodo executar, que
     * executa o metodo mostrar do comando
     * @param comando
     */
    public void executar(Comando comando){
        comando.mostrar();
    }

    /**
     * Metodo gerarEvento, que pede ao utilizador
     * um evento utilizando o scanner
     * e retorna o evento correspondente
     * @return
     */
    private EventoJogo gerarEvento(){
        System.out.print("\nEvento? ");
        String codigoEvento = scanner.next();
        return eventos.get(codigoEvento);
    }

    /**
     * Atributo privado evento,
     * com getter para fins de read-only
     */
    private EventoJogo evento;
    public EventoJogo getEvento(){
        return evento;
    }

}
