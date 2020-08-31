public class Circulo extends Figura {
    float raio;

    public Circulo(Ponto o, float r){
        super(o);
        this.raio = r;

    }

    public String toString(){
        return "Circulo desenhado!";
    }

    public double calcularArea(){
        return (3.14*(raio*raio));
    }

}