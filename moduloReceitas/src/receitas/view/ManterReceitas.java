/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receitas.view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import receitas.controller.ControllerReceitas;
import receitas.model.bean.Receitas;

/**
 *
 * @author gabri
 */
public class ManterReceitas {
    public static void inserir()throws SQLException, ClassNotFoundException{
        String ingredientes = JOptionPane.showInputDialog("Ingredientes");
        String modoPreparo = JOptionPane.showInputDialog("Modo de Preparo");
        String utensilios = JOptionPane.showInputDialog("Untensilios");
        String rendimento = JOptionPane.showInputDialog("Rendimento");
        String tempoPreparo = JOptionPane.showInputDialog("Tempo de Preparo");
        Receitas recEnt = new Receitas(ingredientes, modoPreparo, utensilios, rendimento, tempoPreparo);
        ControllerReceitas contRec= new ControllerReceitas();
        Receitas logSai = contRec.inserir(recEnt);
        JOptionPane.showMessageDialog(null, logSai.toString());
    }
    
    public static void alterar()throws SQLException, ClassNotFoundException{
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        String ingredientes = JOptionPane.showInputDialog("Ingredientes");
        String modoPreparo = JOptionPane.showInputDialog("Modo de Preparo");
        String utensilios = JOptionPane.showInputDialog("Untensilios");
        String rendimento = JOptionPane.showInputDialog("Rendimento");
        String tempoPreparo = JOptionPane.showInputDialog("Tempo de Preparo");
        Receitas recEnt = new Receitas(ingredientes, modoPreparo, utensilios, rendimento, tempoPreparo);
        ControllerReceitas contRec= new ControllerReceitas();
        Receitas logSai = contRec.inserir(recEnt);
        JOptionPane.showMessageDialog(null, logSai.toString());
        
    }
    
    public static void excluir()throws SQLException, ClassNotFoundException{
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        Receitas recEnt = new Receitas(id);
        ControllerReceitas contLog = new ControllerReceitas();
        Receitas logSai = contLog.excluir(recEnt);
        JOptionPane.showMessageDialog(null, logSai.toString());
    }
    
    public static void buscar() throws SQLException, ClassNotFoundException{
        
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        Receitas recEnt = new Receitas(id);
        ControllerReceitas contRec = new ControllerReceitas();
        Receitas logSai = contRec.buscar(recEnt);
        JOptionPane.showMessageDialog(null, logSai.toString());
        
    }
    
    public static void listar()throws SQLException, ClassNotFoundException{
        
        String ingredientes = JOptionPane.showInputDialog("Ingredientes");
        Receitas recEnt = new Receitas(ingredientes);
        ControllerReceitas contRec = new ControllerReceitas();
        List<Receitas> listaSaida = contRec.listar(recEnt);
        listaSaida.forEach(rec -> {
            JOptionPane.showMessageDialog(null, rec.toString());
        });
    }


    public static void menu() throws SQLException, ClassNotFoundException{
        
        String msgErro = "Modulo Inválido"; 
        String msgMenu = "0 - Sair \n 1 - Inserir \n 2 - Alterar \n 3 - Excluir \n 4 - Buscar \n 5 - Listar" ;
 
        int modulo = Integer.parseInt(JOptionPane.showInputDialog(msgMenu));

        switch(modulo) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair");
                    if(sair > 0 ) {
                        menu();
                    } 
                break;
            case 1:
                inserir();
                break;
            case 2:
                alterar();
                break;
            case 3:
                excluir();
                break;
            case 4:
                buscar();
                break;
            case 5:
                listar();
                break;
            default:
                JOptionPane.showMessageDialog(null, msgErro);
                menu();
                break;
        }
    }
}
