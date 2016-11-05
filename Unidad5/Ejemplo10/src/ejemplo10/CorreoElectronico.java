package ejemplo10;

import java.io.Serializable;

public class CorreoElectronico implements Serializable{

    private int idCorreo;
    private String direccionCorreo;
    private Profesor profesor;

    public CorreoElectronico() {

    }

    public CorreoElectronico(int idCorreo, String direccionCorreo, Profesor profesor) {
        this.idCorreo = idCorreo;
        this.direccionCorreo = direccionCorreo;
        this.profesor = profesor;
    }

    public int getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(int idCorreo) {
        this.idCorreo = idCorreo;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return direccionCorreo;
    }
}
