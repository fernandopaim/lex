package lexico;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Fernando Paim da Silva
 * @author Lucas Antunes Amaral
 */
public final class Lexico {

    public ArrayList<String> tabelaPalavrasReservadas = new ArrayList<>();
    public BufferedReader fita;
    
    public Lexico(String file) throws FileNotFoundException {
        ReadFile(file);
        
        tabelaPalavrasReservadas.add("t_signal");
        tabelaPalavrasReservadas.add("p_signal");
    }

    public Tokens nextToken() throws IOException {
        String line = fita.readLine();
        while (line != null) {
            for (StringTokenizer stringTokenizer = new StringTokenizer(line); stringTokenizer.hasMoreTokens();) {
                String token = stringTokenizer.nextToken();
                System.out.println(token);
            }
            
            line = fita.readLine();
        }
        return null;    
    }
    
    public void ReadFile (String file) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(stream);
        fita = new BufferedReader(reader);
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Lexico lex = new Lexico(args[0]);
        ArrayList<Tokens> arvore = new ArrayList<>();
        Tokens tokenNow = lex.nextToken();
        while(tokenNow != null) {
            arvore.add(tokenNow);
            System.out.println(tokenNow.conteudo);
            tokenNow = lex.nextToken();
        }
    }
    
}
