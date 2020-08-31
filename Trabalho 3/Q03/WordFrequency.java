import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class WordFrequency {



    String palavra;

    public WordFrequency(String palavra) {
        
        this.palavra = palavra;

    }

    public void frequenciaPalavras(String palavra){
        Map<String,Integer> repeticoes = new HashMap<String,Integer>(); 
        ArrayList<String> palavras = new ArrayList<String>();
        String[] temporario = palavra.split(" ");

        for(int i = 0; i < temporario.length ; i++  ){
            palavras.add(temporario[i]);
        }

        for(int i = 0; i < temporario.length ; i++  ){
            int ocurrences = Collections.frequency(palavras,palavras.get(i));
            repeticoes.put(palavras.get(i),ocurrences);
        }

        repeticoes.entrySet().stream().forEach(System.out::println);


}
}