public class Main {

    public static void main(String[] args){

        Ponto p1 = new Ponto(2,3);
        //Ate o item e)
        Figura f1 = new Quadrado(p1,2);
        System.out.println(f1);
		System.out.println(f1.calcularArea());
        f1.mover(1,0);

        Figura f2 = new Quadrado(p1,5);
        System.out.println(f2);
        System.out.println(f2.calcularArea());
        f2.mover(3,0);

        Figura f3 = new Circulo(p1,2);
        System.out.println(f3);
        System.out.println(f3.calcularArea());
        f3.mover(1,0);


        Figura f4 = new Circulo(p1,6);
        System.out.println(f4);
        System.out.println(f4.calcularArea());
        f4.mover(1,0);

        //testando o item f
        Figura f5 = new QuadradoColorido(p1,5,1);
        System.out.println(f5);

        Figura f6 = new CirculoColorido(p1,6,1);
        System.out.println(f6);

        
        
        
    


    }
    
}