
package questao.pkg1;
import javax.swing.JOptionPane;

public class Questao1 {

    
    public static void main(String[] args) {
        Double n1,res;
        String num;
        
        num= JOptionPane.showInputDialog(null,"Digite um numéro: ");
       
        n1= Double.parseDouble(num);
        res= n1*n1*n1;
        JOptionPane.showMessageDialog(null, "O cubo de "+ n1+" é "+res);
    }
    
}
