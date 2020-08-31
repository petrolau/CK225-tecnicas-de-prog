public class QuadradoColorido extends Quadrado implements Colorido {

        int cor;

        public QuadradoColorido(Ponto o, int l, int c){
            super(o,l);
            this.cor = c;
        }

        
        public String toString(){
            return "Eu sou um quadrado e sou coloridinho!";
        }

        public int cor(){
            return cor;
        }
}
