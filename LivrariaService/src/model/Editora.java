
package model;
import java.io.Serializable;
/**
 *
 * @author Lais_Bergamo
 */
public class Editora  implements Serializable {
    private int id;
    private String nome;

    public Editora() {
    }

    public Editora(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Editora{" + "id=" + id + ", nome=" + nome + '}';
    }

    

}
