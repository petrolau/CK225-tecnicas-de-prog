public abstract class Figura {
    //Possui x e y, dx e dy.
    Ponto origem;
    
    public Figura(Ponto o){
		this.origem = o;
	}

    public abstract double calcularArea();

    public void mover(int dx, int dy){
        origem.mover(dx,dy);

    }



}




