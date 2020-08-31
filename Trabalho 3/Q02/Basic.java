class Basic extends Conta {


    Basic(int id) {
        //Polimorfismo de inclusao -> referencia para classe-mae, abordando um conjunto amplo de tipos de objetos.
        super(id, "basic");
    }

    //Polimorfismo de sobrecarga -> Metodo com mesmo nome e assinatura diferente.
    Basic(int id, double saldo) {
        super(id,saldo,"basic");
    }

    void creditar(double valor) {
        //Me referenciando ao valor poupanca na classe mae.
        this.poupanca+=valor;
    }

    void debitar(double valor) {
        this.poupanca-=valor;
    }


}

