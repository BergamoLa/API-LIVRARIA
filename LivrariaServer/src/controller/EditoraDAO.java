package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Editora;


public class EditoraDAO {
    
    private final Connection con;
    private PreparedStatement cmd;
    
    public EditoraDAO(){
        this.con = Conexao.conectar();
    }
    
    public int inserir(Editora e){
        try {
            
            String SQL = "insert into tb_editora (nome) values (?)";
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, e.getNome());
            
            if (cmd.executeUpdate() > 0){
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            }
            return -1;
        } catch (SQLException erro) {
            System.err.println("ERRO: " + erro.getMessage());  
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    public int atualizar(Editora e){
        try {
            String SQL = "update tb_editora set nome=? where id=?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, e.getNome());
            cmd.setInt(2, e.getId());
            return (cmd.executeUpdate() > 0) ? e.getId() : -1;
        } catch (SQLException erro) {
            System.err.println("ERRO: " + erro.getMessage());  
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
    }    
    
    public List<Editora> pesquisarPorNome(String nome){
        
     try {
            String SQL = "SELECT * FROM tb_editora WHERE nome LIKE ? order by id asc";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + nome + "%");
            List<Editora> res = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()){
             res.add(new Editora(
                     rs.getInt("id"),
                     rs.getString("nome")
                     
                    
                ));
            }

            return res;
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
       
    }
    
    
}
