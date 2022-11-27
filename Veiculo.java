public class Veiculo{
    private double velocidade;
    private String modelo;

    public void setVelocidade (double v){
        this.velocidade = v;
    }

    public double getVelocidade (){
        return this.velocidade;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void capotar(){
        System.out.println("Capotando...");
    }

    public Veiculo(double velocidade, String modelo){
        this.velocidade = velocidade;
        this.modelo = modelo;
    }
}