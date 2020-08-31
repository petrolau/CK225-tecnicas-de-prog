//Utilizarei ArrayList -> classe que extende collection, inclui valores duplicados. 
//Utilizarei HashMap 
import java.util.*;

public class CountWords{
    int total = 0;
    int distintas = 0;
    String palavra; 

    public CountWords(String palavra) {
        
        this.palavra = palavra;

    }
    public int getTotal() { 
        return this.total;
    }
    
    public int getDistintas() {
        return this.distintas;
    }
    

    public void contaPalavras(String palavra){
        ArrayList<String> palavras = new ArrayList<String>();
        String[] temporario = palavra.split(" ");

        for(int i = 0; i < temporario.length ; i++  ){
            palavras.add(temporario[i]);
            total ++;
        }

        //Criando um HashMap para conseguir o numero de palavras distintas na frase.
        Map<String, Integer> contagem = new HashMap<>();

        //Loopando pela minha ArrayList palavras.
        for(String word: palavras ){
            if (contagem.containsKey(word)){
                contagem.put(word, contagem.get(word) + 1);
            }
            else{
                contagem.put(word,1);
            }

        }
        distintas = contagem.size();
    

    }

    public String toString() {
        return "Total de : " + this.total + " palavras e : " + this.distintas +" distintas.";

    }




    
}