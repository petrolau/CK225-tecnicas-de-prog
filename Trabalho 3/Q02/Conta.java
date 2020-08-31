//OBS: toda conta tem um número identificador e permite operações de crédito,
//débito e consultar saldo.
abstract class Conta {

    private int id;
    private String tipo;
    double poupanca = 0;

    Conta(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    Conta(int id,double poupanca, String tipo){
        this.id = id;
        this.poupanca = poupanca; 
        this.tipo = tipo;
    }

    //Polimorfismo de coerção -> modelo generico para ser implementado nas classes filhas.
    abstract void creditar(double valor);

    abstract void debitar(double valor);

    int getID(){
        return this.id;
    }

    double consultarSaldo(){
        return this.poupanca;
    }

    void setSaldo(double poupanca){
        this.poupanca = poupanca;
    }

    public String toString(){
        return "Conta:" + tipo.toUpperCase() + "\nID:" + this.id + "\nSaldo R$:" + this.poupanca;

    }



    
    
    
}