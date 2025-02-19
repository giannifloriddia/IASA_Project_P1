package agente;

import ambiente.Ambiente;

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

    }

    /**
     * Metodo publico executar
     */
    public void executar(){

    }

    /**
     * Metodo protegido percepcionar, de modo a que seja acessado
     * somente pelas subclasses, que retorna uma percepção
     * @return
     */
    protected Percepcao percepcionar(){
        return null;
    }

    /**
     * Metodo protegido atuar que recebe uma ação como argumento
     * @param acao
     */
    protected void atuar(Acao acao){

    }

}
