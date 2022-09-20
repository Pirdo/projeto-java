package receitas.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import receitas.model.bean.Receitas;
import receitas.util.ConexaoDb;

public class DaoReceitas {
    private final Connection c;
    
    public DaoReceitas() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
    
    public Receitas buscar(Receitas rec) throws SQLException{
        String sql = "select * from receitas WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,rec.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Receitas retorno = null;
            while (rs.next()) {      
            // criando o objeto Receitas
                retorno = new Receitas(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6));
            // adiciona o rec à lista de recs
            }
            stmt.close();
        return retorno;
   }
    
    public Receitas alterar(Receitas rec) throws SQLException{
        String sql = "UPDATE receitas SET ingredientes = ?, modoPreparo = ?, utensilios = ?, rendimento = ?, tempoPreparo = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,rec.getIngredientes());
        stmt.setString(2,rec.getModoPreparo());
        stmt.setString(3,rec.getUtensilios());
        stmt.setString(4,rec.getRendimento());
        stmt.setString(5,rec.getTempoPreparo());
        stmt.setInt(6,rec.getId());
        // executa
        stmt.execute();
        stmt.close();
        return rec;
    }

    public Receitas excluir(Receitas rec) throws SQLException{
        String sql = "delete from receitas WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,rec.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return rec;
    }
    
    public List<Receitas> listar(Receitas recEnt) throws SQLException{
         // recs: array armazena a lista de registros

        List<Receitas> recs = new ArrayList<Receitas>();
        
        String sql = "select * from receitas where ingredientes like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + recEnt.getIngredientes() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Receitas
            Receitas rec = new Receitas(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6)
            );
            // adiciona o rec à lista de recs
            recs.add(rec);
        }
        
        rs.close();
        stmt.close();
        return recs;
        
    }
   
    public Receitas inserir(Receitas rec) throws SQLException{
        String sql = "insert into receitas" + " (ingredientes, modoPreparo, utensilios, rendimento, tempoPreparo)" + " values (?,?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,rec.getIngredientes());
        stmt.setString(2,rec.getModoPreparo());
        stmt.setString(3,rec.getUtensilios());
        stmt.setString(4,rec.getRendimento());
        stmt.setString(5,rec.getTempoPreparo());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            rec.setId(id);
        }
        stmt.close();
        return rec;
    }
}
