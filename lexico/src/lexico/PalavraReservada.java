package lexico;

/**
 *
 * @author fernando
 */
public class PalavraReservada extends Tokens {
    
    public int id;

    public PalavraReservada(int posicaoCursor, String conteudo) {
        this.posicaoCursor = posicaoCursor;
        this.conteudo = conteudo;
    }
    
}
