/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receitas.controller;

import java.sql.SQLException;
import java.util.List;
import receitas.model.bean.Receitas;
import receitas.model.dao.DaoReceitas;

/**
 *
 * @author gabri
 */
public class ControllerReceitas {
    DaoReceitas daoRec;
    
    public Receitas inserir(Receitas log)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.inserir(log);
    }
    
    public Receitas alterar(Receitas log)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.alterar(log);
    }
    
    public Receitas excluir(Receitas log)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.excluir(log);
    }
    
    public Receitas buscar(Receitas log)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.buscar(log);
        
    }
    
    public List<Receitas> listar(Receitas log)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.listar(log);
    }
}
