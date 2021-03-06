package ejemplo11;

import java.io.Serializable;
import java.util.Set;

public class Profesor implements Serializable {
    
    private int id;
    private String nombre;
    private String ape1;
    private String ape2;
    private TipoFuncionario tipoFuncionario;
    private Set<CorreoElectronico> correosElectronicos;

    public Profesor() {
    }

    public Profesor(int id, String nombre, String ape1, String ape2, TipoFuncionario tipoFuncionario) {
        this.id = id;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    @Override
    public String toString() {
        return nombre + '\t' + ape1;
    }

    public Set<CorreoElectronico> getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(Set<CorreoElectronico> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }
}
