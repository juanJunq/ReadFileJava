import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Elevador {
    private int andar_atual;
    private int total_andar;
    private int capacidade;
    private int pessoas;
    public Elevador(){}
    public void Inicializa( int _capacidade, int _total_andar ){
        this.andar_atual = 0;
        this.total_andar = _total_andar;
        this.capacidade = _capacidade;
        this.pessoas = 0;
    }
    public void Entra(){
        if(capacidade == pessoas){
            System.out.println("Capacidade maxima atingida");
        }else{
            pessoas++;
        }
    }
    public void Sai(){
        if(capacidade > 0){
            pessoas--;
        }else{

        }
    }
    public void Sobe(){
        if(andar_atual == total_andar){
            System.out.printf("Ultimo andar atingido");
        }else{
          andar_atual++;
        }
    }
    public void Desce(){
        if(andar_atual == 0){
            System.out.printf("Primeiro andar atingido");
        }else{
            andar_atual--;
        }
    }
    public int getAndar(){
        return  andar_atual;
    }
    public int getTotal(){
        return total_andar;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public int getNumeroPessoas(){
        return pessoas;
    }
}

public class Q2 {
    public static void main(String args[]) throws IOException {
        FileInputStream File = new FileInputStream("C:/Java/File/Arquivo.txt");
        InputStreamReader InputSR = new InputStreamReader(File);
        BufferedReader BufferR = new BufferedReader(InputSR);
        String linha = BufferR.readLine();
        String linha2 = BufferR.readLine();
        int total_andar = Integer.parseInt(linha);
        int capacidade = Integer.parseInt(linha2);
        Elevador elevador = new Elevador();
        elevador.Inicializa(capacidade, total_andar);
        elevador.Entra();
        elevador.Sobe();
        elevador.Entra();
        elevador.Desce();
        elevador.Entra();
        elevador.Sai();
        elevador.Sobe();
        elevador.Desce();
        elevador.Sai();
        elevador.Entra();
    }
}

