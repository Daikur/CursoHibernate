package ejemplo07;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Profesor")
public class Profesor implements Serializable {

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ape1")
    private String ape1;

    @Column(name = "ape2")
    private String ape2;

    @Enumerated(EnumType.ORDINAL)
    private TipoFuncionario tipoFuncionario;

    public Profesor() {
    }

    public Profesor(int id, String nombre, String ape1, String ape2, TipoFuncionario tipoFuncionario) {
        this.id = id;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.tipoFuncionario = tipoFuncionario;
    }
}
