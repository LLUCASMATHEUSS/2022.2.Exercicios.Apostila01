import javax.swing.JOptionPane;

public class TesteVeiculo {
    public static void main(String[] args){
               
        double vel1 =
        Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do veiculo 1 \n"));
        String modelo1 = JOptionPane.showInputDialog("Digite o modelo do veiculo 1 \n");
        
        Veiculo c1 = new Veiculo(vel1, modelo1);
        
        double vel2 =
        Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do veiculo 2 \n"));
        String modelo2 = JOptionPane.showInputDialog("Digite o modelo do veiculo 2 \n");
        
        Veiculo c2 = new Veiculo(vel2, modelo2);
        
        c1.acelerar();
        c1.capotar();

        c2.acelerar();
        c2.capotar();

        System.out.printf("v1 = %2f, model1 = %s\n", c1.getVelocidade(), c1.getModelo());
        System.out.printf("v2 = %2f, model2 = %s\n", c2.getVelocidade(), c2.getModelo());
    }
}
