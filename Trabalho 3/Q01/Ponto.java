public class Ponto {
    float x,y;

    public Ponto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void definirXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void mover(float dx, float dy){
        this.x += dx;
        this.y += dy;
        
    }

}