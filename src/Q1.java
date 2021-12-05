import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Pessoa{
    private String nome;
    private int altura;
    private int byear;
    public Pessoa(String _nome, int _altura, int _byear){
        this.nome = _nome;
        this.altura = _altura;
        this.byear = _byear;
    }
    public Pessoa() {}
    public String getNome(){
        return nome;
    }
    public int getAltura(){
        return altura;
    }
    public int getAno(){
        return byear;
    }
    public int CalcIdade(){
        return 2021 - byear;
    }
}

public class Q1{
    public static void main(String args[]) throws IOException{
        FileInputStream File = new FileInputStream("C:/Java/File/Arquivo.txt");
        InputStreamReader InputSR = new InputStreamReader(File);
        BufferedReader BufferR = new BufferedReader(InputSR);
        String Nome = BufferR.readLine();
        String Altura = BufferR.readLine();
        String Idade = BufferR.readLine();
        int altura = Integer.parseInt(Altura);
        int idade = Integer.parseInt(Idade);
        Pessoa pessoa = new Pessoa(Nome, altura, idade); 
        System.out.printf("Nome: ");
        System.out.println(pessoa.getNome());
        System.out.printf("Altura: ");
        System.out.println(pessoa.getAltura());
        System.out.printf("Idade: ");
        System.out.println(pessoa.CalcIdade());
    }
}

