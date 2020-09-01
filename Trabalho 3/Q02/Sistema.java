import java.util.ArrayList;

public class Sistema {

    ArrayList<Conta> contas = new ArrayList<Conta>();
    int maiorId;

    public void criarContaXPTOBasic(int id) {
        compararId(id);
        if(searchById(id)==null)
            contas.add(new Basic(id));
        else
            System.out.println("Falha ao criar conta,id repetido");
        
    }

    public void criarContaXPTOPlus(int id) {
        compararId(id);
        if(searchById(id)==null)
            contas.add(new Plus(id));
        else
            System.out.println("Falha ao criar conta,id repetido");
    }

    public void criarContaXPTOExtreme(int id) {
        compararId(id);
        if(searchById(id)==null)
            contas.add(new Extreme(id));
        else
            System.out.println("Falha ao criar conta,id repetido");
    }

    public void creditar(int id,double valor){
        try{
            searchById(id).creditar(valor);       
        }catch(NullPointerException n){           
            System.out.println("ID invalido");
        }
    }
    
    public void debitar(int id,double valor){
        try{
            searchById(id).debitar(valor);
        }catch(NullPointerException n){
            System.out.println("ID invalido");
        }
    }

    public double consultarSaldo(int id){
        try{
            return searchById(id).consultarSaldo();
        }catch(NullPointerException e){
            System.out.println("ID inválido");
        }
        return 0.0;
    }

    public Conta searchById(int id){
        for(Conta c:contas){
            if(c.getID()==id){
                return c;
            }
        }
        return null;
    }

    // Polimorfismo de sobrecarga -> Metodo com mesmo nome e assinatura diferente.
    public void criarContaXPTOBasic() {
        criarContaXPTOBasic(++maiorId);
    }

    // Polimorfismo de sobrecarga -> Metodo com mesmo nome e assinatura diferente.
    
    public void criarContaXPTOPlus() {
        criarContaXPTOPlus(++maiorId);
    }

    // Polimorfismo de sobrecarga -> Metodo com mesmo nome e assinatura diferente.
    
    public void criarContaXPTOExtreme() {
        criarContaXPTOExtreme(++maiorId);
    }
    // Polimorfismo de sobrecarga -> Metodo com mesmo nome e assinatura diferente.

    private void compararId(int id) {
        if (id > maiorId) {
            maiorId = id;
        }

    }
}