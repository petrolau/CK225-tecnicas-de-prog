public class CirculoColorido extends Circulo implements Colorido{

    int cor;

    public CirculoColorido(Ponto o, float r, int c){
        super(o,r);
        this.cor = c;
    }


    public String toString(){
        return "Eu sou um circulo e sou coloridinho!";
    }

    public int cor(){
        return cor;
    }
    
}