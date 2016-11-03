package ejemplo06;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Nombre implements Serializable {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ape1")
    private String ape1;

    @Column(name = "ape2")
    private String ape2;

    public Nombre() {

    }

    public Nombre(String nombre, String ape1, String ape2) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
    }

    public String getNombreCompleto() {
        StringBuilder sb = new StringBuilder();
        if ((ape1 != null) && (ape1.trim().length() > 0)) {
            sb.append(ape1);
        }
        if ((ape2 != null) && (ape2.trim().length() > 0)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(ape2);
        }
        if ((nombre != null) && (nombre.trim().length() > 0)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(nombre);
        }

        return sb.toString();
    }

    public String getIniciales() {
        StringBuilder sb = new StringBuilder();
        if ((nombre != null) && (nombre.trim().length() > 0)) {
            sb.append(nombre.substring(0, 1));
        }
        if ((ape1 != null) && (ape1.trim().length() > 0)) {
            sb.append(ape1.substring(0, 1));
        }
        if ((ape2 != null) && (ape2.trim().length() > 0)) {
            sb.append(ape2.substring(0, 1));
        }

        return sb.toString().toUpperCase();
    }
}
