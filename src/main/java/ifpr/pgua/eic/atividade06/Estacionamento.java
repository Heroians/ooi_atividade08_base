package ifpr.pgua.eic.atividade06;
import java.util.*;

public class Estacionamento {
    private String nome;
    private String telefone;
    private ArrayList<Veiculo> veiculos;    

    public Estacionamento(String nome, String telefone){
        this.nome = nome; 
        this.telefone = telefone;
        this.veiculos = new ArrayList<>();
    }   

    

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getNome(){
        return nome;
    }
    
    public void cadastrarVeiculo(String placa, String modelo, int anoFabricacao, String cor){
        veiculos = new Veiculo(placa, modelo, modelo, anoFabricacao, cor);

    }

    public ArrayList<Veiculo> listarTodosVeiculos(){
        return veiculos;
    }

    public ArrayList<Veiculo> listarVeiculosEstacionados(){
        return veiculos;
    }



}
