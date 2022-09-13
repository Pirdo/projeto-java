/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receitas.controller;


import java.sql.SQLException;
import java.util.List;
import receitas.model.bean.Usuario;
import receitas.model.dao.DaoUsuario;

/**
 *
 * @author ProfAlexandre
 */
public class ControllerUsuario {
    
    DaoUsuario daoUsu = null;
    
    public Usuario inserir (Usuario u) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.inserir(u);
    }
    
    public Usuario alterar (Usuario u) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.alterar(u);
    }
 
    public Usuario excluir (Usuario u) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.excluir(u);
    }
    
    public List<Usuario> listar (Usuario u) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.listar(u);
    }

    public Usuario buscar (Usuario u) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.buscar(u);
    }

    public Boolean validar (Usuario u) throws SQLException, ClassNotFoundException {
        boolean validado = false;
        daoUsu = new DaoUsuario();
        Usuario usuSaida = daoUsu.validar(u);
        if(usuSaida.getLogin().equals(u.getLogin())) {
            if(usuSaida.getSenha().equals(u.getSenha())) {
                validado = true;
            }
        }
        return validado;
    }
    
    public Usuario validarWeb (Usuario u) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        Usuario usuSaida = daoUsu.validar(u);
        return usuSaida;
    }



}
