public class Quadrado extends Figura {
    
    int lado;

    //recebe o ponto de origem e o lado l
    public Quadrado(Ponto o, int l){
        //chamada da "origem" da super classe
        super(o);
        this.lado = l;

    }

    public String toString(){
        return "Quadrado desenhado!";
    }

    public double calcularArea(){
        return lado*lado;
    }
}