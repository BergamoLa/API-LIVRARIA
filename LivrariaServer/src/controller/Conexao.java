package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

     
    //PostgreSQL    
    private static final String USUARIO = "postgres"; 
    private static final String SENHA = "senha";
    private static final String URL = "jdbc:postgresql://localhost:5432/LIVRARIA";
    private static final String DRIVER = "org.postgresql.Driver";
    
   
 
    public static Connection conectar(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(
                URL,
                USUARIO,
                SENHA
            );
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }
    }
    
    public static void desconectar(Connection con){
        try {
            if ( con != null){
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
        }
    }    
    
    //
    // Teste de conexão
    //
    public static void main(String[] args) {
        //Estabelecer a conexão com o SGBD
        Connection con = Conexao.conectar();
        
        //Testar se a conexão está ativa
        if (con != null){
            System.out.println("Conexão realizada com sucesso!");
        }
  
    }    
    
}
