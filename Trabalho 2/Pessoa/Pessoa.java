public class Pessoa {

    private String nome;
    private int idade;
    
    Pessoa (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    void retornaInfo(){
        System.out.println("NOME: "+ nome +", IDADE: "+idade);
    }
    void setNome(String nome){
        this.nome = nome;
    }
    String getNome()
    {
        return this.nome;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    int getIdade()
    {
        return this.idade;
    }
    

}