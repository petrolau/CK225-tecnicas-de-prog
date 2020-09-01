import java.util.*;

public class Teste_Hash2 {
    public static void main(String args[]){
        Collection<String> mesesHash=new ArrayList<>();
        
        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");
        System.out.println("Hashset:");

        list(mesesHash);
        list2(mesesHash);
    }
    public static void list2(Collection c){
        System.out.println("------------- Lista 2 --------------");
        for(Object o:c){
            System.out.println(o);
        }
    }
    public static void list(Collection c){
        System.out.println(c);
    }
}
    


    
