package server;

import controller.EditoraDAO;
import controller.LivroDAO;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Editora;
import model.Livro;
import service.ILivraria;

public class Server extends UnicastRemoteObject implements ILivraria{
    
    public Server() throws RemoteException{
        super();
    }

    //
    // Editora
    //
    @Override
    public int inserir(Editora e) throws RemoteException {
        return new EditoraDAO().inserir(e);
    }

    @Override
    public int atualizar(Editora e) throws RemoteException {
        return new EditoraDAO().atualizar(e);
    }

    @Override
    public List<Editora> pesquisarPorNome(String chave) throws RemoteException {
        return new EditoraDAO().pesquisarPorNome(chave);
    }
    
    //
    // Livro
    //
   @Override
    public int inserir(Livro l) throws RemoteException {
         return new LivroDAO().inserir(l);
    }

    @Override
    public int atualizar(Livro l) throws RemoteException {
    return new LivroDAO().atualizar(l);
    }

    @Override
    public List<Livro> pesquisarPorTitulo(String chave) throws RemoteException {
        return new LivroDAO().pesquisarPorTitulo(chave);
    }
    
    
    //
    public static void main(String[] args) {
        try { //trycatch
            // [1] Instanciar o servidor
            ILivraria srv = new Server();   //polimorfismo por generalização
            
            // [2] Registrar a porta de comunicação
            Registry rg = LocateRegistry.createRegistry(ILivraria.SERVICE_PORT);
            
            // [3] Disponibilização do métodos remotos
            rg.bind(ILivraria.SERVICE_NAME, srv);
            
            System.out.println("Servidor >> " + SERVICE_NAME + " << iniciado.");
            System.out.println(rg.toString());
            
        } catch (AlreadyBoundException | RemoteException e) {
            System.err.println("ERRO: " + e.getMessage());
        }
    }

    
}
