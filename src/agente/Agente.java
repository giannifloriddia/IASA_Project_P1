package agente;

import ambiente.Ambiente;
import ambiente.Evento;

public class Agente {

    /**
     * Atributos privados ambiente e controlo
     */
    private Ambiente ambiente;
    private Controlo controlo;

    /**
     *  Construtor da classe Agente, com um ambiente e um controlo como argumentos.
     */
    public Agente(Ambiente ambiente, Controlo controlo) {
        this.ambiente = ambiente;
        this.controlo = controlo;
    }

    /**
     * Metodo publico executar, que chama os metodos percepcionar, processar e atuar
     * e que não devolve nada.
     * Este metodo chama o metodo percepcionar, que retorna uma percepção,
     * chama o metodo processar do controlo, que recebe a percepção e devolve uma ação,
     * e chama o metodo atuar, que executa o comando da ação no ambiente.
     */
    public void executar(){
        Percepcao percepcao = percepcionar();
        Acao acao = controlo.processar(percepcao);
        atuar(acao);
    }

    /**
     * Metodo protegido percepcionar, de modo a que seja acessado
     * somente pelas subclasses, que retorna uma percepção.
     * este metodo chama o metodo observar do ambiente e
     * retorna uma percepção com o evento observado.
     * @return
     */
    protected Percepcao percepcionar(){
        Evento evento = ambiente.observar();
        return new Percepcao(evento);
    }

    /**
     * Metodo protegido atuar que recebe uma ação como argumento
     * e executa o comando da ação no ambiente, se a ação não for nula.
     * @param acao
     */
    protected void atuar(Acao acao){
        if (acao != null)
            ambiente.executar(acao.getComando());
    }

}
