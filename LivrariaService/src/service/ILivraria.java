package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Editora;
import model.Livro;

public interface ILivraria extends Remote{
    
    public static final String SERVICE_HOST = "127.0.0.1";
    public static final String SERVICE_NAME = "livraria_service";
    public static final int SERVICE_PORT = 4099;
    
    public abstract int inserir(Editora e) throws RemoteException;
    public abstract int atualizar(Editora e) throws RemoteException;
    public abstract List<Editora> pesquisarPorNome(String chave) throws RemoteException;
    
    public abstract int inserir(Livro l) throws RemoteException;
    public abstract int atualizar(Livro l) throws RemoteException;
    public abstract List<Livro> pesquisarPorTitulo(String chave) throws RemoteException;    
    
}
