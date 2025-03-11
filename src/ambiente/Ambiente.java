package ambiente;

/**
 * Interface que define um ambiente de simulação.
 */
public interface Ambiente {
    //métodos especificados do diagrama
    public void evoluir();
    public Evento observar();
    public void executar(Comando comando);
}
