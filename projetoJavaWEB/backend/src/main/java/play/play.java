package play;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import receitas.view.ManterReceitas;

public class play {
	static String  msgErroSis = "Opcao Invalido"; 
    static String  msgMenu = "0 - Sair \n 1 - Manter Receitas";

    public static void main(String args[]) throws SQLException, ClassNotFoundException{
        menu();
    }
        
    public static void menu() throws SQLException, ClassNotFoundException{
            int ops = Integer.parseInt(JOptionPane.showInputDialog(msgMenu));
            switch(ops) {
                case 0: 
                    int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair");
                    if(sair > 0 ) {
                        menu();
                    } 
                    break;
                case 1:
                    ManterReceitas.menu();
                    break;
            default:
                    JOptionPane.showMessageDialog(null, msgErroSis);
                    menu();
                    break;
        }
   }
}
