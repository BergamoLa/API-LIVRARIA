
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Livro;

/**
 *
 * @author Lais_Bergamo
 */
public class LivroDAO {
  private final Connection con;
  private PreparedStatement cmd;

 
    public LivroDAO() {
        this.con = Conexao.conectar();
    }

    

     public int inserir(Livro l){
        try {
           
            String SQL = "insert into tb_livro (titulo,autor,ano,preco,quantidade,id_editora) values (?,?,?,?,?,?)";
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, l.getTitulo());
            cmd.setString(2, l.getAutor());
            cmd.setInt(3, l.getAno());
            cmd.setDouble(4, l.getPreco());
            cmd.setInt(5, l.getQuantidade());
            cmd.setInt(6, l.getIdEditora());
            
            if (cmd.executeUpdate() > 0){
                ResultSet rs = cmd.getGeneratedKeys();
                 return l.getId();
            }
            return -1;
        } catch (SQLException erro) {
            System.err.println("ERRO: " + erro.getMessage());  
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
      public int atualizar(Livro l){
        try {
           
            String SQL = "update tb_livro set titulo=?, autor=?, ano=?, preco=?, quantidade=?, id_editora=? where id=?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, l.getTitulo());
            cmd.setString(2, l.getAutor());
            cmd.setInt(3, l.getAno());
            cmd.setDouble(4, l.getPreco());
            cmd.setInt(5, l.getQuantidade());
            cmd.setInt(6, l.getIdEditora());
            cmd.setInt(7, l.getId());
            
            return (cmd.executeUpdate() > 0) ? l.getId() : -1;
        } catch (SQLException erro) {
            System.err.println("ERRO: " + erro.getMessage());  
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
    }    
   
      
      public List<Livro> pesquisarPorTitulo(String titulo){
       try {
            String SQL = "SELECT * FROM tb_livro WHERE titulo LIKE ? order by id asc";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + titulo + "%");
            List<Livro> res = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()){
             res.add(new Livro(
                     rs.getInt("id"),
                     rs.getString("titulo"),
                     rs.getString("autor"),
                     rs.getInt("ano"),
                     rs.getDouble("preco"),
                     rs.getInt("quantidade"),
                     rs.getInt("id_editora")
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
