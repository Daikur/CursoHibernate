package ejemplo10;

import java.io.Serializable;

public class Municipio implements Serializable{
    private int idMunicipio;
    private String codProvincia;
    private String codMunicipio;
    private String nombre;

    public Municipio() {
    }

    public Municipio(int idMunicipio, String codProvincia, String codMunicipio, String nombre) {
        this.idMunicipio = idMunicipio;
        this.codProvincia = codProvincia;
        this.codMunicipio = codMunicipio;
        this.nombre = nombre;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return idMunicipio + "." + nombre;
    }
}
