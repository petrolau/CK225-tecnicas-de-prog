// Final questao 10
class Main{

    public static void main (String args[])
    {
       Pessoa p1 = new Pessoa("Ana", 40);
       Pessoa p2 = new Pessoa("Joao", 22);
       System.out.println("Nome 1: " +p1.getNome() + " e idade: " + p1.getIdade());
       System.out.println("Nome 2: " +p2.getNome() + " e idade: " + p2.getIdade());
       p1.retornaInfo(); 
       p2.retornaInfo();
        

   }
}

// Na questao 9, acontece o seguinte com a modificacao: 

//class Main

//{

//    public static void main (String args[])
//   {

//        Pessoa p1 = new Pessoa();
//        p1.setNome(“Ana”);
//       Pessoa p2 = new Pessoa();
//       p2.setNome(“João”);
//       System.out.println (p1.getNome());
//       System.out.println (p2.getNome());
//        p1 = p2;
//       System.out.println (p1.getNome());
//       System.out.println (p2.getNome());


//   }

//}

// Os seguintes erros ocorrem

//Main.java:23: error: illegal character: '\u201c'
        //p1.setNome(“Ana”);
                   
//Main.java:23: error: illegal character: '\u201d'
        //p1.setNome(“Ana”);
                       
//Main.java:23: error: not a statement
        //p1.setNome(“Ana”);
                    
//Main.java:25: error: illegal character: '\u201c'
        //p2.setNome(“João”);
                   
//Main.java:25: error: illegal character: '\u201d'
        //p2.setNome(“João”);
                        
//Main.java:25: error: not a statement
        //p2.setNome(“João”);
                    
//6 errors

//Construtor nao definido.

