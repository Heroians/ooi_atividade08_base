package ifpr.pgua.eic.atividade06;

public class Veiculo {

    private String modelo;
    private String cor; 
    private String placa;
    private String fabricante;
    private int anoFabricacao;
    private boolean estaEstacionado;
 
    public Veiculo (String placa, String modelo, String fabricante, int anoFabricacao, String cor){
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;

    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isEstaEstacionado(){
        return estaEstacionado;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    
    public String getCor(){
        return cor;
    }

    public Boolean registraEntrada() {
        if(!isEstaEstacionado()){
            return estaEstacionado = true;
        }
        return false;
    }

    public Boolean registraSaida() {
        if(!isEstaEstacionado()) return false;
            estaEstacionado = false;
        return true;
    }


}
