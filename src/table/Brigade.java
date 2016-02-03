package table;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Гетманов Павел
 * pawka9494@mail.ru
 */
@Entity
@Table(name="Brigade")
public class Brigade implements Serializable {
    @Id
    @Column (name="idBrigade")
    private int idBrigade;
    /**
    * id 1 человека из состава бригады
    * 
    * 
    * 
    * TODO только имя, привязку переносим в персонал
    */
    @Column (name="idPersonal1")
    private Personal idPersonal1;
    /**
    * id 2 человека из состава бригады
    */
    @Column (name="idPersonal2")
    private Personal idPersonal2;

    public void setIdBrigade(int idBrigade) {
        this.idBrigade = idBrigade;
    }

    public void setIdPersonal1(Personal idPersonal1) {
        this.idPersonal1 = idPersonal1;
    }

    public void setIdPersonal2(Personal idPersonal2) {
        this.idPersonal2 = idPersonal2;
    }

    public int getIdBrigade() {
        return idBrigade;
    }

    public Personal getIdPersonal1() {
        return idPersonal1;
    }

    public Personal getIdPersonal2() {
        return idPersonal2;
    }
    
}
