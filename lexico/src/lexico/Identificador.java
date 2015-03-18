package lexico;

/**
 *
 * @author fernando
 */
public class Identificador extends Tokens {
    
    public Identificador(int posicaoCursor, String conteudo) {
        this.posicaoCursor = posicaoCursor;
        this.conteudo = conteudo;
    }
    
}
