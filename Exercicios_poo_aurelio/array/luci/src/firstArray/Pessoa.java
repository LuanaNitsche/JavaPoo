package firstArray;


public class Pessoa {
    private String nome;
    private int idade;


    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public String toString() {
        return "Nome: {" + this.getNome() + "} \nIdade: {" + this.getIdade()
   
         +   "}\n";
    }   



    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        
        this.nome = nome;
    }

    public void setIdade (int idade){
        
        if(idade < 0){
            throw new IllegalArgumentException();
        }
        this.idade = idade;
    }
}
