public class Plus extends Conta{

    public Plus(int id){
        //Polimorfismo de inclusao -> enviando para a classe mae
        super(id,"basic");
    }

    //Polimorfismo de sobrecarga
    public Plus(int id, double saldo ){
        //Polimorfismo de inclusao
        super(id, saldo, "plus");
    }

    public void creditar(double valor){
        this.poupanca += valor+(valor*0.005);
    }

    public void debitar(double valor){
        this.poupanca -= valor;
    }
    
}