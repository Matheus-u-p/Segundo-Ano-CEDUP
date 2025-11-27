//Camilli Vitória Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link

public class Usuario{
    private String nome;
    private int idade;
    private String cpf;

    public Usuario(String nome, int idade, String cpf){
      this.nome = nome;
      this.idade = idade;
      this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
      return idade;
    }

    public String getCpf(){
      return cpf;
    }

    @Override
    public String toString(){
      return nome + "," + idade + ","+ cpf;
    }

    public static Usuario fromString(String linha){
      String[] partes = linha.split(",");
      return new Usuario(partes[0], Integer.parseInt(partes[1]), partes[2]);
    }
}