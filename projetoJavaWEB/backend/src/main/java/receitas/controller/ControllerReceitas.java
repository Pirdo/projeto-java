package receitas.controller;

import java.sql.SQLException;
import java.util.List;
import receitas.model.bean.Receitas;
import receitas.model.dao.DaoReceitas;

public class ControllerReceitas {
    DaoReceitas daoRec;
    
    public Receitas inserir(Receitas rec)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.inserir(rec);
    }
    
    public Receitas alterar(Receitas rec)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.alterar(rec);
    }
    
    public Receitas excluir(Receitas rec)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.excluir(rec);
    }
    
    public Receitas buscar(Receitas rec)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.buscar(rec);
        
    }
    
    public List<Receitas> listar(Receitas rec)throws SQLException, ClassNotFoundException{
        daoRec = new DaoReceitas();
        return daoRec.listar(rec);
    }
}
