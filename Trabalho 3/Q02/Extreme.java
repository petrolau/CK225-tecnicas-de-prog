public class Extreme extends Conta{

    public Extreme(int id){
        //Polimorfismo de inclusao
        super(id,"extreme");
    }

    //Polimorfismo de sobrecarga
    public Extreme(int id, double saldo){
        super(id,saldo,"extreme");
    }

    public void creditar(double valor){
        this.poupanca += valor + (valor*0.002);

    }

    public void debitar(double valor){
        this.poupanca -= valor;
        this.poupanca += (valor*0.002);
    }
}